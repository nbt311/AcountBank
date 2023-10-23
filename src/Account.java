package src;

import java.util.ArrayList;

public class Account {
    private Integer id;
    private Double balance;
    private String typeAccount;
    private ArrayList<Object> transactions;

    public Account(Integer id, Double balance, String typeAccount) {
        this.id = id;
        this.balance = balance;
        this.typeAccount = typeAccount;
        this.transactions = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public ArrayList<Object> getTransactions() {
        return transactions;
    }

    public void setTransactions(String infomation) {
        this.transactions.add(infomation);
    }
}
