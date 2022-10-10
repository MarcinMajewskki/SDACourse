package org.example.strings.oop_excercises_SDA.Bank;

import java.math.BigDecimal;

public class BankAccount {
    private String type;
    private static int ID;
    private int accountID;
    private BigDecimal balance = BigDecimal.valueOf(0);

    public BankAccount(String type) {
        this.type = type;
        accountID = ID;
        ID++;
    }

    public void depositMoney(BigDecimal amount){
        if (amount.intValue() < 10){
            System.out.println("Sorry, you can deposit only more than 10$");
        }
        else {
           balance = balance.add(amount);
            System.out.println("Successfully deposited " + amount + " $");
        }
    }

    public void cashWithdrawal(BigDecimal amount){
        if (balance.compareTo(amount) == -1){
            System.out.println("You dont have enough money for that operation !");
        }
        else {
            balance = balance.subtract(amount);
            System.out.println("Thats " + amount + "$ for you ");
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAccountID() {
        return accountID;
    }


    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

}
