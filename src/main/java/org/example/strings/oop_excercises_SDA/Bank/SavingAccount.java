package org.example.strings.oop_excercises_SDA.Bank;

import java.math.BigDecimal;

public class SavingAccount extends BankAccount{
    public SavingAccount() {
        super("Saving account");
    }

    public void recalculateBalance() {
        super.setBalance(getBalance().multiply(BigDecimal.valueOf(1.01d)));
    }

}
