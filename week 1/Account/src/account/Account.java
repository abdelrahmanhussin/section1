package account;

import java.util.Date ;

public class Account 
{
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();
    Account(){};
    Account(int id, int balance)
    {
        this.id = id;
        if (balance > 0.0)
        {
            this.balance = balance;
        }
    };
    public int getId()
    {
        return id;
    };
    public double getBalance()
    {
        return balance;
    };
    public double getAnnualInterestRate() 
    {
        return annualInterestRate;
    };
    public void setId(int newId) 
    {
        id = newId;
    };
    public void setBalance(double newBalance) 
    {
        balance = newBalance;
    };
    public void setAnnualInterestRate(double newAnnualInterestRate) 
    {
        annualInterestRate = newAnnualInterestRate;
    }
    public Date getDateCreated()
    {
       return dateCreated;
    }
    public double getMonthlyInterestRate() 
    {
        return annualInterestRate/12;
    }
    public void withdraw(double Amount)
    {
        if(Amount > 0.0 && Amount <= balance)
        {
            balance -= Amount; 
        }
        else
        {
            System.out.println("Withdraw money less than or equal to your balance, your balance = " + balance);
        }
    }
    public void deposit(double Amount)
    {
        if(Amount > 0.0)
        {
            balance += Amount; 
        }
    }
    public static void main(String[] args)
    {
        Account acc = new Account(1112,20000);
        acc.setAnnualInterestRate(4.5);
        acc.withdraw(2500);
        acc.deposit(3000);
        System.out.println("Balance:" + acc.getBalance());
        System.out.println("Monthly Interest:" + acc.getMonthlyInterestRate());
        System.out.println("Date Created:" + acc.getDateCreated());
    }
}
