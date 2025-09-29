package com.ravitSoft.RavitFinance.model;

public enum InvestmentType {
    STOCK("Stock"),
    BOND("Bond"),
    ETF("Exchange Traded Fund"),
    MUTUAL_FUND("Mutual Fund"),
    CRYPTOCURRENCY("Cryptocurrency"),
    REAL_ESTATE("Real Estate"),
    COMMODITY("Commodity"),
    OTHER("Other");
    
    private final String displayName;
    
    InvestmentType(String displayName) {
        this.displayName = displayName;
    }
    
    public String getDisplayName() {
        return displayName;
    }
}

    
