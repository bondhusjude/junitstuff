package junitstuff;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    void testDeposit() {
        var bank = new BankAccount(); 
        var old_number = bank.getBalance();
        bank.deposit(2);
        assertTrue(bank.getBalance() > old_number);
    }

    @Test
    void testGetAccountName() {
        var bank = new BankAccount();
        //assertTrue(bank.getAccountName() == bank.accountName); // does not work cus private and has no name
        //if was public and had a name it would work
    }

    @Test
    void testGetBalance() {

    }

    @Test
    void testWithdraw() {
        var bank = new BankAccount(); //should i use var???? is it bad practice
        bank.deposit(2);
        assertTrue(bank.getBalance() < 2);
    }
}
