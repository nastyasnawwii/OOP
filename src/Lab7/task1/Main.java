package Lab7.task1;

public class Main {
    public static void main(String[]args){
        BankAccount account1 = new BankAccount(2000, 0);
        BankAccount account2 = new BankAccount(2001, 0);

        account1.setBalance(-400);
        account2.setBalance(800);

        account1.deposit(100);
        account1.withdraw(200);
        account1.withdraw(150);

        account2.deposit(300);
        account2.withdraw(-350);
        account2.withdraw(300);
        account2.withdraw(-50);
    }
}
