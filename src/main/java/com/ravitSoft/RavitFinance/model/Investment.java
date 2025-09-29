package com.ravitSoft.RavitFinance.model;


import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;




@Entity
@Table(name = "investments")
public class Investment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
   @Column(nullable = false)
   private String symbol;

   @Column(name = "company_name", nullable = false)
   private String companyName;

    @Enumerated(EnumType.STRING)
    @Column(name = "investment_type")
    private InvestmentType investmentType;

    @Column(name = "quantity", nullable = false)
    private BigDecimal quantity;

    @Column(name = "purchase_price", nullable = false)
    private BigDecimal purchasePrice;

    @Column(name = "current_price")
    private BigDecimal currentPrice;

    @Column(name = "total_invested")
    private BigDecimal totalInvested;
    
    @Column(name = "current_value")
    private BigDecimal currentValue;

    @Column(name = "profit_loss")
    private BigDecimal profitLoss;

    @Column(name = "profit_loss_percentage" )
    private BigDecimal profitLossPercentage;
    
    @Column(name = "purchase_date")
    private LocalDateTime purchaseDate = LocalDateTime.now();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;


    // Constructors
    
    public Investment() {
    }
    
    public Investment(String symbol, String companyName, InvestmentType investmentType, 
                     BigDecimal quantity, BigDecimal purchasePrice, Portfolio portfolio) {
        this.symbol = symbol;
        this.companyName = companyName;
        this.investmentType = investmentType;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
        this.portfolio = portfolio;
        this.totalInvested = quantity.multiply(purchasePrice);
    }
    
    //Get and Set

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }
    
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    
    public InvestmentType getInvestmentType() { return investmentType; }
    public void setInvestmentType(InvestmentType investmentType) { this.investmentType = investmentType; }
    
    public BigDecimal getQuantity() { return quantity; }
    public void setQuantity(BigDecimal quantity) { this.quantity = quantity; }
    
    public BigDecimal getPurchasePrice() { return purchasePrice; }
    public void setPurchasePrice(BigDecimal purchasePrice) { this.purchasePrice = purchasePrice; }
    
    public BigDecimal getCurrentPrice() { return currentPrice; }
    public void setCurrentPrice(BigDecimal currentPrice) { this.currentPrice = currentPrice; }
    
    public BigDecimal getTotalInvested() { return totalInvested; }
    public void setTotalInvested(BigDecimal totalInvested) { this.totalInvested = totalInvested; }
    
    public BigDecimal getCurrentValue() { return currentValue; }
    public void setCurrentValue(BigDecimal currentValue) { this.currentValue = currentValue; }
    
    public BigDecimal getProfitLoss() { return profitLoss; }
    public void setProfitLoss(BigDecimal profitLoss) { this.profitLoss = profitLoss; }
    
    public BigDecimal getProfitLossPercentage() { return profitLossPercentage; }
    public void setProfitLossPercentage(BigDecimal profitLossPercentage) { this.profitLossPercentage = profitLossPercentage; }
    
    public LocalDateTime getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(LocalDateTime purchaseDate) { this.purchaseDate = purchaseDate; }
    
    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
}