package org.example.strings.oop_excercises_SDA.Bank;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        SavingAccount account = new SavingAccount();
        SavingAccount account1 = new SavingAccount();
        SavingAccount account2 = new SavingAccount();
        SavingAccount account3 = new SavingAccount();
        SavingAccount account4 = new SavingAccount();
        SavingAccount account5 = new SavingAccount();

        account.depositMoney(BigDecimal.valueOf(1000));
        account1.depositMoney(BigDecimal.valueOf(2000));
        account2.depositMoney(BigDecimal.valueOf(3000));
        account3.depositMoney(BigDecimal.valueOf(4000));
        account4.depositMoney(BigDecimal.valueOf(5000));
        account5.depositMoney(BigDecimal.valueOf(6000));


        System.out.println(account.getBalance());
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println(account3.getBalance());
        System.out.println(account4.getBalance());
        System.out.println(account5.getBalance());
        for (; ; ) {
            try {
                Thread.sleep(5000);
                account.recalculateBalance();
                System.out.println(account.getBalance());
                account1.recalculateBalance();
                System.out.println(account1.getBalance());
                account2.recalculateBalance();
                System.out.println(account2.getBalance());
                account3.recalculateBalance();
                System.out.println(account3.getBalance());
                account4.recalculateBalance();
                System.out.println(account4.getBalance());
                account5.recalculateBalance();
                System.out.println(account5.getBalance());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
