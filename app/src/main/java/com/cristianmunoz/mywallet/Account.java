package com.cristianmunoz.mywallet;

public class Account {

    private String name;
    private String type;
    private Double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Account(String name, String type, Double balance) {
        this.name = name;
        this.type = type;
        this.balance = balance;
    }
}
