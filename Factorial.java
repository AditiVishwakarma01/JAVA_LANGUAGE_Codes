import java.util.Scanner;

public class Factorial {
    public Factorial() {
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number to find Factorial:");
        int result = 1;
        int num = s.nextInt();

        for(int i = 1; i <= num; ++i) {
            result *= i;
        }

        System.out.println("Factorial is:" + result);
    }
}
