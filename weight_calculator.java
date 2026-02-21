// it's a weight calculator that converts lbs to kgs and kgs to lbs
import java.util.*;
public class weight_calculator {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        // first we will ask the user to choose which conversion they want to do

        System.out.println("enter 1 to convert lbs to kgs");
        System.out.println("enter 2 to convert kgs to lbs");
        System.out.println("please enter your choice");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("enter weight in lbs");
            double lbs = sc.nextDouble();
            double newWeight1 = lbs/2.204;
            System.out.printf("the new weight is %.3f kgs", newWeight1); 
        } else if (choice == 2) {
            System.out.println("enter weigth in kgs");
            double kgs = sc.nextDouble();
            double newWeight2 = kgs*2.204;
            System.out.printf("the new weight is %.3f lbs", newWeight2); 
        } else {
            System.out.println("invalid input");
        }
    }
}