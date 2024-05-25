package adapterDesignPattern.bankInterface;

import java.util.Scanner;

public class hdfc implements bankingInterfaces {

    @Override
    public void createAccount() {
        // TODO Auto-generated method stub
        accounts.createAccount();
    }

    @Override
    public void addMoney() {
        // TODO Auto-generated method stub
        System.out.println("## ADD MONEY ##");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter account number : ");
        double accountNumber =  myObj.nextDouble();
        System.out.println("Enter amount to credit : ");
        double money =  myObj.nextDouble();
        accounts.addMoney( accountNumber, money );
    }

    @Override
    public void payMoney() {
        // TODO Auto-generated method stub
        System.out.println("## PAY MONEY ##");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter account number : ");
        double accountNumber =  myObj.nextDouble();
        System.out.println("Enter amount to debit : ");
        double money =  myObj.nextDouble();
        accounts.addMoney( accountNumber, money );
    }

    @Override
    public void checkBalance() {
        // TODO Auto-generated method stub
        System.out.println("## CHECK BALANCE ##");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter account number : ");
        double accountNumber =  myObj.nextDouble();
        accounts.checkBalance(accountNumber);
    }
}
