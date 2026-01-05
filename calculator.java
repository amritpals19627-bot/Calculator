import java.util.Scanner;
public class calculator {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("please enter your 1st number");
        int a = sc.nextInt();
        
        System.out.print("please enter your 2nd number");
        int b = sc.nextInt();

        System.out.println("chosse yourr operation:");
        System.out.println("1 : + ");
        System.out.println("2 : - ");
        System.out.println("3 : * ");
        System.out.println("4 : / ");

        int choose = sc.nextInt();
        
        if (choose==1) {
            System.out.println("addition is :" + (a+b));
        } else if (choose==2) {
            System.out.println("subtraction is :" + (a-b));
        } else if (choose==3) {
            System.out.println("multiplication is:" + (a*b));
        } else if (choose==4) {
            if (b!=0) {
                System.out.println("division is:" + (a/b));
            } else {
                System.out.println("it is not divisible by zero");
            }
        } else {
            System.out.println("invalid choice");
        }
        sc.close();
    }
}