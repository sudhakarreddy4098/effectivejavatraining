package in.conceptarchitect.financeapp;

import java.util.Scanner;

import in.conceptarchitect.finance.BankAccount;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String password="pass";
		Scanner scanner=new Scanner(System.in);
		BankAccount bankAtm=new BankAccount(4098,"Sudhakar",password,20000,12);	
		
		int ch;
		do {
			System.out.println("Enter your choice");
			System.out.println("\n1. Display Account Details\n2. Deposit \n3. Withdraw \n4. Credit Interest\n5. Change Password\n6. Exit");
			ch=scanner.nextInt();
			switch(ch)
			{
			case 1:
				bankAtm.show();
				break;
			
			case 2:
				bankAtm.deposit(4000);
				break;
				
			case 3:
				bankAtm.withdraw(2000,"pass");
				break;
			
			case 4:
				bankAtm.creditInterest();
				break;
				
				
			case 5: bankAtm.changePassword();
					break;
					
			case 6: return;

			}
		}
		while(ch!=6);		
	}
}