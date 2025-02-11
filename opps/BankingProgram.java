public class BankingProgram {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.accNo = "10004";
        acc.setBalance(10000);
        acc.accType = "Savings";

        Account acc2 = new Account("10005",
                            20000,
                        "Current");

        System.out.println("Account no:" + acc.accNo);
        System.out.println( "Balance: " + acc.getBalance());

        System.out.println("Account no:" + acc2.accNo);
        System.out.println( "Balance: " + acc2.getBalance());
    }
}
class Account {
    
    String accNo;
    private double balance;

    String accType; // Savings, Current

    public Account() {

    }
    // Encapsulation
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }

    // Constructor Overloading
    public Account(String accNo, double balance, String accType) {
        this.accNo = accNo;
        this.balance = balance;
        this.accType = accType;
    }

}


