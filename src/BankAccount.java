public class BankAccount {

    private String accountNumber;
    private double balance;

    //konstruktori

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //getter

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    //setter

    public void setAccountNumber(String accountNumber) {
        //tarkistetaan että tilinumero ei ole tyhjä
        if (accountNumber != null && !accountNumber.isEmpty()) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Account number cannot be empty");
        }
    }
    public void setBalance(double balance) {
        //saldo ei voi olla negatiivinen
        if (balance >= 0) {
        this.balance = balance;
    } else {
            System.out.println("Balance cannot be negative");
        }
}

//talletus metodi
public void deposit(double amount) {
    if (amount > 0) {
    balance += amount;
        System.out.println("Deposited " + amount + " into account " + accountNumber);
} else {
        System.out.println("Cannot deposit ");
    }
}

//nostometodi
public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
        balance -= amount;
        System.out.println("Withdrawn " + amount + " from account " + accountNumber);
    } else if (amount > balance) {
        System.out.println("Cannot withdraw ");
    } else {
        System.out.println("Cannot withdraw ");
    }
}

//tulostetaan tilin tiedot


    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
