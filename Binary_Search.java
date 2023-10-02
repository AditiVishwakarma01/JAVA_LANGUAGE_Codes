import java.io.PrintStream;
import java.util.Scanner;

public class Binary_Search {
    public Binary_Search() {
    }

    public static int Binary(int[] num, int key) {
        int start = 0;
        int end = num.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) {
                return mid;
            }

            if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[20];
        int key = 25;
        System.out.println("Enter the size of Array:");
        int size = sc.nextInt();
        System.out.println("Enter the elements of Array:");

        for(int i = 0; i < size; ++i) {
            num[i] = sc.nextInt();
        }

        PrintStream var10000 = System.out;
        int var10001 = Binary(num, key);
        var10000.println("Index for key is:" + var10001);
    }
}
