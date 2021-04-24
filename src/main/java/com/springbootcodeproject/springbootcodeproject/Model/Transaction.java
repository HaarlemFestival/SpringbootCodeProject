package com.springbootcodeproject.springbootcodeproject.Model;

import java.sql.Timestamp;

public class Transaction {

    private Account sender;
    private Account receiver;
    private float amount;
    private User user;
    private Timestamp timestamp;

    public Transaction(Account sender, Account receiver, float amount, User user, Timestamp timestamp) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.user = user;
        this.timestamp = timestamp;
    }

    public Account getSender() {
        return sender;
    }

    public void setSender(Account sender) {
        this.sender = sender;
    }

    public Account getReceiver() {
        return receiver;
    }

    public void setReceiver(Account receiver) {
        this.receiver = receiver;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
