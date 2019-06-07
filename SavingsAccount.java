import java.util.Scanner; 
import java.util.Random;
//import java.Math.*;
import javax.swing.JOptionPane;
import javax.swing.JoptionPane;
inmport java.text.DecimalFormat;
import java.util.Scanner; // need the Scanner class
import javax.swing.JOptionPane;
import java.io.*;


package javaapplication1;

/**
 * Melvin Gilbert
 * Project 1
 */
public class SavingsAccount {
    private double balance;
    private double interestRate;
    private double totalInterest;
    private double totalDeposit;
    private double totalWithdraw;
      
    //to get uuser Saving Account Balance
    public SavingsAccount(double startingBalance, double interest)
    {
        balance = startingBalance;
        interestRate = interest;
        totalInterest = 0;
        totalDeposit = 0;
        totalWithdraw = 0;
    }
    
    public void Withdraw(double amount)
    {
        balance = balance - amount;
        totalWithdraw = totalWithdraw + amount;
    }
    
    public void Deposit(double amount)
    {
        balance = balance + amount;
        totalDeposit = totalDeposit + amount;
    }
    
    public void AddInterest()
    {
        double monthlyInterestRate = 0;
        double interestAmount = 0;
        monthlyInterestRate = interestRate/12;
        
        interestAmount = balance * monthlyInterestRate;
        totalInterest = totalInterest + interestAmount;
        balance = balance + interestAmount;
    }
    //account Balance  
    private double GetBalance ()
    {
        return balance;
    }
    //account Totle Deposit
    private double GetTotalDeposit ()
    {
        return totalDeposit;
    }
    
    private double GetTotalWithdraw ()
    {
        return totalWithdraw;
    }
    
    private double GetTotalInterest ()
    {
        return totalInterest;
    }
    // Will be display to user
    public void Display()
    {
        System.out.println("Ending Balance: " + GetBalance());
        System.out.println("Total Deposit: " + GetTotalDeposit());
        System.out.println("Total Withdraw: " + GetTotalWithdraw());
        System.out.println("Total Interest: " + GetTotalInterest());
    }
}
