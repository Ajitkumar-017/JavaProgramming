// Custom exception for low balance scenario
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

// Custom exception for negative number scenario
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

// Custom exception for password mismatch scenario
class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private String accountNumber;
    private String password;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String password, double balance) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = balance;
    }

    // Method to perform balance enquiry
    public double balanceEnquiry() {
        return balance;
    }

    // Method to withdraw amount
    public void withdraw(double amount, String enteredPassword) throws LowBalanceException, PasswordMismatchException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Amount cannot be negative.");
        }
        if (!enteredPassword.equals(password)) {
            throw new PasswordMismatchException("Incorrect password.");
        }
        if (balance - amount < 0) {
            throw new LowBalanceException("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Current balance: " + balance);
    }

    // Method to deposit amount
    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Amount cannot be negative.");
        }
        balance += amount;
        System.out.println("Deposit successful. Current balance: " + balance);
    }

    // Method to transfer amount to another account
    public void transfer(BankAccount receiver, double amount, String enteredPassword) throws LowBalanceException, PasswordMismatchException, NegativeNumberException {
        withdraw(amount, enteredPassword); // Withdraw amount from sender's account
        receiver.deposit(amount); // Deposit amount into receiver's account
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two bank accounts
        BankAccount account1 = new BankAccount("123456789", "password1", 1000.0);
        BankAccount account2 = new BankAccount("987654321", "password2", 2000.0);

        // Perform operations
        try {
            account1.deposit(500.0);
            account1.withdraw(200.0, "password1");
            account1.transfer(account2, 300.0, "password1");
        } catch (LowBalanceException | PasswordMismatchException | NegativeNumberException e) {
            e.printStackTrace();
        }
    }
}
