import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(500, "Matt");
        bankAccount.deposit(100);
        System.out.println(bankAccount.toString());
        // If needed for credit, withdrawal works as well.
//        bankAccount.withdrawal(31);
//        System.out.println(bankAccount.toString());

        BankAccount bankAccount1 = new BankAccount(5000, "Larry");
        BankAccount bankAccount2 = new BankAccount(300, "Mary");

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter the amount you want to transfer: ");
//        double amount = scanner.nextDouble();
//
//        bankAccount1.withdrawal(amount);
//        bankAccount2.deposit(amount);
            bankAccount1.transfer(bankAccount2,200);
    }
}
