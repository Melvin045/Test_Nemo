import java.util.Random;
import java.Math.*;
import javax.swing.JOptionPane;
import javax.swing.JoptionPane;
import ava.text.DecimalFormatSymbols;
import java.text.DecimalFormat;
import java.util.Scanner; // need the Scanner class
import java.io.*;

/**
 * Melvin Gilbert
 * Project 1
 *
 */
public class SavingsAccountDemo {
    private double balance;
    private double interestRate;
    private double totalInterest;
    private double totalDeposit;
    private double totalWithdraw;
    private double savingsAccount;
      
    //Here is how we will fine the user Balance of th user account
    public static void savingsAccount(double startingBalance, double interest)
    {
     
        balance = startingBalance;
        interestRate = interest;
        totalInterest = 0;
        totalDeposit = 50;
       totalWithdraw = 0;
    }
    //Withdraw amount
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
   
    //Interes Rate user will get 
    public void AddInterest()
    {
        double monthlyInterestRate = 0;
        double interestAmount = 0;
        monthlyInterestRate = interestRate/12;
        
        interestAmount = balance * monthlyInterestRate;
        totalInterest = totalInterest + interestAmount;
        balance = balance + interestAmount;
    }
    //To Get user Balance for his Account
    private double GetBalance ()
    {
        return balance;
    }
    //To get the user total deposit amount
    private double GetTotalDeposit ()
    {
        return totalDeposit;
    }
     //To get the user total withdraw amount
    private double GetTotalWithdraw ()
    {
        return totalWithdraw;
    }
    //Here is user interest
    private double GetTotalInterest ()
    {
        return totalInterest;
    }
    //here we will diplay the infor to user
    public void Display()
    {
        System.out.println("Ending Balance: " + GetBalance());
        System.out.println("Total Deposit: " + GetTotalDeposit());
        System.out.println("Total Withdraw: " + GetTotalWithdraw());
        System.out.println("Total Interest: " + GetTotalInterest());
    }
}
