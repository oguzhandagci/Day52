public class BankAccount {

    private double balance;
    private String name;

    public BankAccount(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double withdrawal(double amount) {
        return this.balance -= amount;
    }

    @Override
    public String toString() {
        return "My account balance: " + this.balance;
    }

    public void transfer (BankAccount account2, double amount){
        balance-=amount;
        account2.deposit(amount);
        System.out.println(this.name+"'s account balance: "+this.balance);
        System.out.println(account2.name+"'s account balance: "+account2.balance);

    }

}
