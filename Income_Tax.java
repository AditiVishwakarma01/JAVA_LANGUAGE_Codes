import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Income_Tax {
    public Income_Tax() {
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your Income:");
        int income = sc.nextInt();
        
        int slab = income - 500000;
        
        int slab1 = income - 1000000;
        
        int tax1 = slab * 20 / 100 + 12500;
        
        int tax2 = slab1 * 30 / 100 + 100000 + 12500;
        
        DecimalFormat df = new DecimalFormat("###,###.00");
        
        if (income < 500000) {
            System.out.println("You don't have to Pay Tax!!");
        
        } else {
            PrintStream var10000;
            String var10001;

        if (income > 500001 && income <= 1000000) {
            System.out.println("You have to Pay 20% Tax");
            var10000 = System.out;

            var10001 = df.format((long)income);
            var10000.println("Your income was : " + var10001);
            
            var10001 = df.format((long)tax1);
            var10000.println("Your Tax Amount is : " + var10001);
            
            var10001 = df.format((long)(income - tax1));
            var10000.println("Your income after Tax reduction is : " + var10001);
        
        } else if (income >= 1000000) {
            System.out.println("You have to pay 30% Tax");
        
            var10000 = System.out;
            var10001 = df.format((long)income);
        
            var10000.println("Your income was : " + var10001);
            var10001 = df.format((long)tax2);
        
            var10000.println("Your Tax Amount is : " + var10001);
            var10001 = df.format((long)(income - tax2));
        
            var10000.println("Your income after Tax reduction is : " + var10001);
        }
    }

        System.out.println("Thank you!!");
    }
}
