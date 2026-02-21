import java.util.*;
public class compund_interest_calculator {
    public static void main(String[]args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("enter the principle amount: ");
        System.out.println("enter the rate of interest: ");
        System.out.println("enter the time period in years: ");
        System.out.println("enter the number of times interest is compounded per year: ");

        double principle , rate , time , n; //n is the number of times the interest is compounded per year
        // like annualy n=1, semi-annually n=2, quarterly n=4, monthly n=12, daily n=365
        principle = sc.nextDouble();
        rate = sc.nextDouble() / 100; // rate should be in decimal form, for example if the rate is 5% then it should be 0.05
        time = sc.nextDouble();
        n = sc.nextDouble();

        double amount = principle*Math.pow((1 + rate/n ),n*time);
        System.out.printf("the final amount is %,.3f\n", amount);

        System.out.printf("the interest earned is %,.3f\n", (amount - principle));


    }
    
}
