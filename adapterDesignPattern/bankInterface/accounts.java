package adapterDesignPattern.bankInterface;

import java.util.HashMap;

public class accounts {

    static HashMap<Double, Double> accountsMap = new HashMap<>(); 

    double accountNumber;
    double balance;

    static void createAccount(){
        // this.accountNumber = Math.random()*70;
        // return this.accountNumber;
        double accountNumber = Math.random()*70;
        accountsMap.put( accountNumber, 0.0 );
        System.err.println(accountsMap);
        System.out.println("Account successfully created. Your new account number : "+ accountNumber);
    }
    static void checkBalance(double accountNumber){
        //return accounts.get(accountNumber);
        System.err.println(accountsMap);
        System.out.println("Current account balance is : "+ accountsMap.get(accountNumber));
    }

    static void addMoney( double accountNumber, double money ){
        //accounts[accountNumber] = accounts[accountNumber] + money
        //this.balance += money;
        double currentBalance = accountsMap.get(accountNumber) + money;
        accountsMap.put(accountNumber, currentBalance);
        System.out.println("Amount credited !! Updated Balance is : INR "+ currentBalance);
    }

    static void payMoney( double accountNumber, double money ){
        //this.balance -= money;
        if ( accountsMap.get(accountNumber) < money ) {
            System.out.println("Insufficient Balance");
        }
        else{
            double currentBalance = accountsMap.get(accountNumber) - money;
            accountsMap.put(accountNumber, currentBalance);
            System.out.println("Amount debited !! Updated Balance is : INR "+ currentBalance);
        }
    }


}
