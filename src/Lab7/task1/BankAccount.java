package Lab7.task1;

public class BankAccount {

    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, int startBalance){
        this.accountNumber = accountNumber;
        this.balance =startBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0){
            System.out.println("Balance cannot be minus");
            return;
        }else {
            System.out.println("Balance set to: " + balance);
            this.balance = balance;
        }
    }
    public void deposit(double amount){
        if(amount < 0){
            System.out.println("Deposit cannot be minus");
        }else {
            balance += amount;
            System.out.println("Deposit: " + amount + ", new balance is: " +balance);
        }
    }

    public void withdraw(double amount) {
        if (amount < 0){
            System.out.println("withdraw cannot be minus");
        } else if (amount > balance) {
            System.out.println("amount exceeds balance");
        } else {
            balance -= amount;
            System.out.println("withdraw: " + amount + ", new balance: " + balance);
        }
    }
}