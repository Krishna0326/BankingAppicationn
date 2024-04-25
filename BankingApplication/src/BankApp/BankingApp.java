package BankApp;

import java.util.Scanner;

public class BankingApp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many number of customers do you want to input");
		int n=sc.nextInt();
		BankDetails C[]=new BankDetails[n];
		
		for(int i=0;i<C.length;i++)
		{
			C[i]=new BankDetails();
			C[i].openAccount();
		}
		
		int ch;
		do
		{
			System.out.println("\n ***Banking System Application***");  
            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");
            System.out.println("Enter Your Choice");
            ch=sc.nextInt();
            switch(ch)
            {
            case 1:
            	for(int i=0;i<C.length;i++)
            	{
            		C[i].showAccount();
            	}
            	break;
            case 2:
            	System.out.println("Enter account no.you want to search");
            	String ac_no=sc.next();
            	boolean found=false;
            	for(int i=0;i<C.length;i++)
            	{
            		found=C[i].search(ac_no);
            		if(found)
            		{
            			break;
            			
            		}
            	}
            	if(!found)
            	{
            		System.out.println("search failed! Account Number doesn't exist");
            	}
            	break;
            case 3:
            	System.out.println("Enter Account No :");
            	ac_no=sc.next();
            	found=false;
            	for(int i=0;i<C.length;i++)
            	{
            		found=C[i].search(ac_no);
            		if(found)
            		{
            			C[i].deposit();
            			break;
            		}
            	}
            	if(!found)
            	{
            		System.out.println("Search failed! Account Number does't exist");
      
            	}
            	break;
            case 4:
            	 System.out.print("Enter Account No : ");  
                 ac_no = sc.next();  
                 found = false;  
                 for (int i = 0; i < C.length; i++) {  
                     found = C[i].search(ac_no);  
                     if (found) {  
                         C[i].withdrawl();  
                         break;  
                     }  
                 }  
                 if (!found) 
                 {
                	 System.out.println("Search failed! Account doesn't exist..!!");
                 }
                 break;
            case 5:
            	System.out.println("see you soon..");
            	break;
            }
            
		}
		while(ch!=5);
	}
}
