package com.springbootcodeproject.springbootcodeproject.Model;

import com.springbootcodeproject.springbootcodeproject.Enum.AccountType;

public class Account {

    private String accountNumber;
    private float accountBalance;
    private AccountType accountType;

    public Account(String accountNumber, float accountBalance, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }


}
