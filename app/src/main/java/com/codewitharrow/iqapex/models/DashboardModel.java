package com.codewitharrow.iqapex.models;

public class DashboardModel {

    String balance, growth;

    public DashboardModel(String balance, String growth)
    {
        this.balance = balance;
        this.growth = growth;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getGrowth() {
        return growth;
    }

    public void setGrowth(String growth) {
        this.growth = growth;
    }

    public DashboardModel(){}
}
