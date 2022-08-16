import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Create account
        Account account = new Account();
        
        System.out.print("Input Name: ");
        account.setName(sc.nextLine());

        System.out.print("Input Account Number: ");
        account.setAccountNumber(sc.nextLine());

        System.out.print("Input Email: ");
        account.setEmail(sc.nextLine());

        System.out.print("Input Account Balance: ");
        account.setAccountBalance(sc.nextDouble());
        
        //Original info
        System.out.printf("\nOriginal Account Infor:\n");
        account.displayInfo();
        sc.nextLine();

        //Update info
        System.out.printf("\nChange email to: ");
        account.changeEmail(sc.nextLine());

        System.out.printf("\nInput recharge amount: ");
        account.recharge(sc.nextDouble());

        System.out.printf("\nUpdated Account Infor:\n");
        account.displayInfo();

        sc.close();
    }
}
