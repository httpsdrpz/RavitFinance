package com.ravitSoft.RavitFinance.model;

public enum TransactionType {
    BUY("Buy"),
    SELL("Sell"),
    DIVIDEND("Dividend"),
    DEPOSIT("Deposit"),
    WITHDRAWAL("Withdrawal"),
    TRANSFER("Transfer"),
    FEE("Fee");
    
    private final String displayName;
    
    TransactionType(String displayName) {
        this.displayName = displayName;
    }
    
    public String getDisplayName() {
        return displayName;
    }
}