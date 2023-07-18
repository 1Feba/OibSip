import java.awt.Menu;
import java.util.Scanner;

class ATMs{
	float Balance=50000;
	int PIN=1010;
	
	public void checkpin() {
		System.out.println("Enter your pin : ");
		Scanner sc=new Scanner(System.in);
		int enteredpin=sc.nextInt();
		
		if (enteredpin==PIN) {
			menu();
		}
		else {
			System.out.println("Enter a valid pin");
		}
	}
	public void menu() {
		System.out.println("Select your choice : ");
		System.out.println("1. Check A/C Balance");	
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposite Money");
		System.out.println("4. EXIT");
		
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		
		if (opt==1) {
			checkBalance();
		}
		else if (opt==2) {
			withdrawMoney();
		}
		else if (opt==3) {
			depositeMoney();
		}
		else if (opt==4) {
			return;
		}
		else {
			System.out.println("Enter a valid choice");
		}

	}
	public void checkBalance() {
		System.out.println("Balance : "+Balance);
		menu();
	}
	public void withdrawMoney() {
		System.out.println("Enter the amount to be withdrawn");
		Scanner sc=new Scanner(System.in);
		float amount = sc.nextFloat();
		
		if (amount>Balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			Balance=Balance-amount;
			System.out.println("Money Withdrawn Sucessfully !!!");
		}
		menu();
		
	}
	public void depositeMoney() {
		System.out.println("Enter the amount to be deposited");
		Scanner sc=new Scanner(System.in);
		float amount = sc.nextFloat();
		Balance=Balance+amount;
		System.out.println("Money Deposited Sucessfully !!!");
		menu();
	}
}
public class ATMmachine {
public static void main(String[] args) {
	ATMs obj=new ATMs();
	obj.checkpin();
}
}
