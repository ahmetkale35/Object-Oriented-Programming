package Week12Lab1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class mainClass {

	    public static void main(String[] args) {
	        ArrayList<BankAccount> myAccounts = new ArrayList<>();
	        BankAccount a1 = new BankAccount(1, "Ahmet", 1500.0);
	        BankAccount a2 = new BankAccount(2, "Ali", 1400.0);
	        BankAccount a3 = new BankAccount(3, "Mehmet", 1200.0);
	        BankAccount a4 = new BankAccount(4, "Arif", 1600.0);

	        myAccounts.add(a1);
	        myAccounts.add(a2);
	        myAccounts.add(a3);
	        myAccounts.add(a4);
	        
	        for (BankAccount account : myAccounts) {
	            System.out.println(account);
	        }

	        Collections.sort(myAccounts, Comparator.comparingDouble(BankAccount::getBalance));
	        
	        System.out.println("------------------------------------");
	        
	        for (BankAccount account : myAccounts) {
	            System.out.println(account);
	        }
	        
	        for (BankAccount account : myAccounts) {
	            account.balanceChange(500.0);
	        }
	        System.out.println("------------------------------------");
	        
	        for (BankAccount account : myAccounts) {
	            System.out.println(account);
	        }
	    }
	}


