package lab5;

class Account {

    private int accountNumber;
    private double balance;
    private static int totalAccounts = 0;
    private static double totalBankBalance = 0;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

        totalAccounts++;
        totalBankBalance += balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static void displayBankSummary() {
        System.out.println("Total Accounts: " + totalAccounts);
        System.out.println("Total Bank Balance: " + totalBankBalance);
    }
}


public class Banksys {

    public static void main(String[] args) {

        // Creating accounts from different branches
        Account a1 = new Account(101, 5000);
        Account a2 = new Account(102, 10000);
        Account a3 = new Account(103, 7500);

        // Display bank summary
        Account.displayBankSummary();
    }
}