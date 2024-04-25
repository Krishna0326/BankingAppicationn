package BankApp;

import java.util.Scanner;

public class BankDetails 
{
	private String acctNo;
	private String name;
	private String acc_type;
	private long balance;
	
	Scanner sc=new Scanner(System.in);
	
	
	public void openAccount()
	{
		System.out.println("Enter Account Num");
		acctNo =sc.next();
		System.out.println("Enter Account Type");
		acc_type=sc.next();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter Balance");
		balance=sc.nextLong();
	}
	
	public void showAccount()
	{
		System.out.println("Name of account holder:"+name);
		System.out.println("Account no:"+acctNo);
		System.out.println("Account type :"+acc_type);
		System.out.println("Balance: "+balance);
		
	}
	
	public void deposit()
	{
		long amt;
		System.out.println("Enter the amount you want to deposit");
		amt=sc.nextLong();
		balance=balance+amt;
	}
	
	public void withdrawl()
	{
		long amt;
		System.out.println("Enter the amount you want to withdrawl");
		amt=sc.nextLong();
		if(balance>=amt)
		{
			balance=balance-amt;
			System.out.println("Balance after withdrawl:"+balance);
			
		}
		else
		{
			System.out.println("your balance is less than "+amt+"\t Transaction Failed");
			
		}
		
	}
	public boolean search(String ac_no)
	{
		if(acctNo.equals(ac_no))
		{
			showAccount();
			return(true);
		}
		else 
		{
		return(false);
		}
	}
	
	

}
