
package adapterDesignPattern;

import adapterDesignPattern.bankInterface.bankingInterfaces;
import adapterDesignPattern.bankInterface.hdfc;

class phonePe {

    public static void main(String[] args) {

        bankingInterfaces bk = new hdfc();
        bk.createAccount();
        bk.createAccount();
        bk.checkBalance();
        bk.addMoney();
        bk.addMoney();
        bk.checkBalance();
        bk.addMoney();
        bk.checkBalance();
        // bk.addMoney(42.44603212453881, 45.7);
        // bk.checkBalance(42.44603212453881);
        
    }

    
}