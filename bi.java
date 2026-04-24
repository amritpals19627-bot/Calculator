import java.util.Scanner;
public class bi {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args) {

        double balance = 0;
        int choice;
        boolean isrunning = true;

        while(isrunning) {
            System.out.println("******************");
            System.out.println("Banking Interface");
            System.out.println("******************");

            System.out.println("press 1 to check balance");
            System.out.println("press 2 to add money");
            System.out.println("press 3 to widraw money");
            System.out.println("press 4 to exit");
            System.out.println("please enter a number from 1-4");
    
            choice = sc.nextInt();

            switch(choice) {
                case 1 -> checkbalance(balance); 
                
                case 2 -> balance += deposit();
                
                case 3 -> balance -= widraw(balance);
                
                case 4 -> isrunning = false;
                
                default -> System.out.println("invalid input");
            }


        }
    }
    static void checkbalance(double balance) {
        System.out.printf("$%.2f\n" ,balance);
    }
    static double deposit() {
        
        double amount;
        
        System.out.print(" enter an amount to deposit : ");
        
        amount = sc.nextDouble();

        if (amount < 0) {
            System.out.println("amount can't be negative");
            return 0;
        } else {
            return amount;
        } 
        
        
    }
    static double widraw(double balance) {
        double debit;

        System.out.print("enter an amount to widraw : ");
        debit = sc.nextDouble();

        if (debit > balance) {
            System.out.println("you don't have sufficient balance");
            return 0;
        } else {
            return debit;
            
        }
        
    }
    
}
