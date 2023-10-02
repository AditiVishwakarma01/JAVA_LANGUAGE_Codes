import java.util.Scanner;

public class GST_Calculator {
    public GST_Calculator() {
    }

    public static void Calculator() {
        Scanner s = new Scanner(System.in);
        double[] a = new double[100];
        System.out.println("Enter the Size of Array:");
        int num = s.nextInt();
        System.out.println("Enter the Percentage of GST(From 18% to 28%):");
        float per = (float)s.nextInt();
        System.out.println("Enter Elements of Array:");

        int i;
        for(i = 0; i < num; ++i) {
            a[i] = s.nextInt();
        }

        for(i = 0; i < num; ++i) {
            double result = a[i] + a[i] * (double)per / 100.0;
            System.out.println("Cost After GST is:\n" + result);
        }

    }

    public static void main(String[] args) {
        Calculator();
    }
}
