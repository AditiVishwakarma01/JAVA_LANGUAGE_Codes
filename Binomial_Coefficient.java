import java.util.Scanner;

public class Binomial_Coefficient {
    public Binomial_Coefficient() {
    }

    public static void Binomial(double n, double k) {
        double fact_n = 1.0;

        for(int i = 1; (double)i <= n; ++i) {
            fact_n *= (double)i;
        }

        double fact_k = 1.0;

        for(int j = 1; (double)j <= k; ++j) {
            fact_k *= (double)j;
        }

        double subtract = n - k;
        double fact2 = 1.0;

        for(int a = 1; (double)a <= subtract; ++a) {
            fact2 *= (double)a;
        }

        double result_bottom = fact_k * fact2;
        double result = fact_n / result_bottom;
        System.out.println("Binomial Coefficient is:");
        System.out.print("\u001b[0;31m");
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The value of n >= k (n/k)!!\n------------------->");
        System.out.println("Enter value of n:");
        double n = (double)sc.nextInt();
        System.out.println("Enter value of k:");
        double k = (double)sc.nextInt();
        Binomial(n, k);
    }
}
