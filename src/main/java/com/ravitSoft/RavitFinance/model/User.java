package com.ravitSoft.RavitFinance.model;

import jakarta.persistence.*;
import jakarta.validation.contraints.Email;
import jakarta.validation.contraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(unique = true)
    private String username;

    @Email
    @NotBlank
    @Column(unique = true)
    private String email;
    
    @NotBlank
    private String password;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "total_portfolio_value")
    private String phoneNumber;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY )
    private List<Transaction> transactions;

    //Constructors

    public User() {}

    public User (String username, String email, String password, String fullname){
        this.username = username;
        this.email = email;
        this.password = password;
        this.fullName = fullname;

    }


    //get and set

    public Long getId(){return id;}
    public void setId(Long id) {this.id = id;}


    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getPassword() { return password;}
    public void setPassword(String password) { this.password = password;}

    public String getFullName() {return fullName;}
    public void setFullName(String fullName) { this.fullName = fullName;}

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public BigDecimal getTotalPortfolioValue() { return totalPortfolioValue;}
    public void setTotalPortfolioValue(BigDecimal totalPorftfolioValue) (this.totalPortfolioValue = totalPortfolioValue;)

    public LocalDateTime getCreatedAt() {return createdAt;}
    public void setCreatedAt(LocalDateTime createdAt) {this.createdAt = createdAt;}

    public List<Portfolio> getPortfolios() {return portfolio;}
    public void serPortfolios(List<Portfolio> portfolios) {this.portfolios = portfolios;}

    public List<Transaction> getTransactions() {return transactions;}
    public void setTransactions(list<Transaction> transactions ) { this.transactions= transactions;}

    @Override
    public String toString(){
        return "User{" +
                "id"+ id +
                ",username='" + username + '\''
                ",email='" + email + '\'' + 
                ",totalPortfolioValue=" + totalPorftfolioValue + 
                ",createdAt=" + createdAt + '{';
            
    }
}



