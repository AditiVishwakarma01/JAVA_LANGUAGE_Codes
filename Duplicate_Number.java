import java.util.Scanner;

public class Duplicate_Number {
    public Duplicate_Number() {
    }

    public static void main(String[] args) {
        int count = 0;
        int[] A = new int[30];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int num = sc.nextInt();
        System.out.println("Enter the Elements of Array:");

        int i;
        for(i = 0; i < num; ++i) {
            A[i] = sc.nextInt();
        }

        for(i = 0; i < num; ++i) {
            for(int j = i + 1; j < num; ++j) {
                if (A[i] == A[j]) {
                    ++count;
                    System.out.println("Duplicate Number is:" + A[i]);
                }
            }
        }

        if (count == 0) {
            System.out.println("There are No Duplicate Numbers");
        }

    }
}
