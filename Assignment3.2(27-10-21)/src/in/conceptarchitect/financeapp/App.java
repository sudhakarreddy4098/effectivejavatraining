package in.conceptarchitect.financeapp;

import in.conceptarchitect.finance.ATM;
import in.conceptarchitect.finance.Bank;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank B=new Bank(2255,"pa@ss",21000);

		ATM A=new ATM();
		
		A.withdraw(2255,"p@ss",21000);
		A.Deposit(2255, 34000);
		
		A.changePassword("p@ss","sudhakar@");
		
//		String password="p@ss";
//		BankAccount a1=new BankAccount(222, "Vivek",password, 50000, 12);
//		
//		System.out.println("1 Bank");
//		 
//		System.out.println("2 BankAccount");
//
//		System.out.println("3 ATM");
//
//		
//		int i=sc.nextInt();
//
//	      switch(i)
//
//	      {
//
//		 case 1:
//
//		
//	break;
//
//		 case 2:
//		
//		
//
//		break;
//		
//		 case 3:
//			 
//			 A.options();
//
//
//			break;
// 
//
//		case 0:
//	        
//	         System.exit(0);
//
//		break;
//	      }
		
		
	}

}