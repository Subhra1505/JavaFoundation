class BankAccount {
    private double balance;

    // Setter (Deposit)
    public void deposit(double amount) {
        balance = balance + amount;
    }

    // Setter (Withdraw)
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Getter
    public double getBalance() {
        return balance;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.deposit(5000);
        acc.withdraw(2000);

        System.out.println("Remaining Balance: " + acc.getBalance());
    }
}
