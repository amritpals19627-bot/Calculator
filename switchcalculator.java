import java.util.Scanner;
public class switchcalculator {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter 1st number");
        int x = sc.nextInt();
        System.out.println("please enter 2nd number");
        int y = sc.nextInt();

        System.out.println("1 : + ");
        System.out.println("2 : - ");
        System.out.println("3 : * ");
        System.out.println("4 : / ");

        System.out.println("please enter your choice");

        int choice = sc.nextInt();

        switch(choice) {
            case 1 :
                System.out.println("addition is :" + (x+y));
                break;
            case 2 :
                System.out.println("sub is :" + (x-y));
                break;
            case 3 :
                System.out .println("mul is :" + (x*y));
                break;
            case 4 :
                if (y!=0) {
                System.out.println("div is :" + (x/y));
                } else {
                    System.out.println("it is not divisible by zero");
                }
                break;
            default :
                System.out.println(" invalid choice");
        }
        sc.close();
    }
    
}
