
public class BankingDriver {
	public static void main(String[] args) {

		BankAccount nicksAcct = new BankAccount("Nick", 450, 550);
		// reading the constructor from "BankAccount.java" object
		// need to declare that its a bankaccount

		BankAccount carolsAcct = new BankAccount("Carol", 600, 700);
		// reads from the constructor in "BankAccount.java" object

		nicksAcct.printReport();
		carolsAcct.printReport();
		// works because printReport is a behavior of the "BankAccount.java" object

		// so since I created all of this according to the constructor I don't
		// need to do system.out.print because that is attached to the
		// constructor

		int nicksMoney = nicksAcct.getCheckMoney() + nicksAcct.getSaveMoney();
		int carolsMoney = carolsAcct.getCheckMoney() + carolsAcct.getSaveMoney();
		// declare that nicksMoney or carolsMoney are variables and say what type they
		// are

		int totalMoney = nicksMoney + carolsMoney;
		// add all of them together

		System.out.println("Total money in all accounts: $" + totalMoney);
		// prints it all out

		nicksAcct.makeCheckingDeposit(100);
		// don't need to make it an int because it says void in the constructor
		// and it has commands in the () after it

		nicksAcct.printReport();

		
		int nicksCheckingMoney = 550;
		int nicksSavingsMoney = 550;
		//declare what nick has in his checking and savings account

		nicksAcct.makeCheckingWithdrawal(nicksCheckingMoney);
		nicksAcct.makeSavingsWithdrawal(nicksSavingsMoney);
		//withdraw all money from nicks account

		carolsAcct.makeCheckingDeposit(nicksCheckingMoney);
		carolsAcct.makeCheckingDeposit(nicksSavingsMoney);
		//add all of nicks money to carols account (you can't use 
		//nicksmoney because it will not have the 100 bc its from the start 

		nicksAcct.printReport();
		carolsAcct.printReport();

	}
}
