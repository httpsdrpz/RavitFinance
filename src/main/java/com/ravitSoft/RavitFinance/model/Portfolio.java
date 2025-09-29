package com.ravitSoft.RavitFinance.model;


import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "portfolios")
public class Portfolio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    private String description;
    
    @Column(name = "total_value")
    private BigDecimal totalValue = BigDecimal.ZERO;
    
    @Column(name = "total_invested")
    private BigDecimal totalInvested = BigDecimal.ZERO;
    
    @Column(name = "profit_loss")
    private BigDecimal profitLoss = BigDecimal.ZERO;
    
    @Column(name = "profit_loss_percentage")
    private BigDecimal profitLossPercentage = BigDecimal.ZERO;
    
    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Investment> investments;
    
    // Constructors
    public Portfolio() {
    }
    
    public Portfolio(String name, String description, User user) {
        this.name = name;
        this.description = description;
        this.user = user;
    }
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public BigDecimal getTotalValue() {
        return totalValue;
    }
    
    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }
    
    public BigDecimal getTotalInvested() {
        return totalInvested;
    }
    
    public void setTotalInvested(BigDecimal totalInvested) {
        this.totalInvested = totalInvested;
    }
    
    public BigDecimal getProfitLoss() {
        return profitLoss;
    }
    
    public void setProfitLoss(BigDecimal profitLoss) {
        this.profitLoss = profitLoss;
    }
    
    public BigDecimal getProfitLossPercentage() {
        return profitLossPercentage;
    }
    
    public void setProfitLossPercentage(BigDecimal profitLossPercentage) {
        this.profitLossPercentage = profitLossPercentage;
    }
    
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    
    public User getUser() {
        return user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    public List<Investment> getInvestments() {
        return investments;
    }
    
    public void setInvestments(List<Investment> investments) {
        this.investments = investments;
    }
}



