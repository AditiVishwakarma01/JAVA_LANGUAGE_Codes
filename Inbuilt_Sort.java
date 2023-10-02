import java.util.Arrays;
import java.util.Collections;

public class Inbuilt_Sort {
  
    public static void Basic_Inbuilt(int[] arr) {
        Arrays.sort(arr);
    }

    public static void Basic_Reverse(Integer[] a) {
        Arrays.sort(a, Collections.reverseOrder());
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1};
        Integer[] a = new Integer[]{1, 2, 3, 4, 5};
        Basic_Inbuilt(arr);
        System.out.println("Array after Basic Inbuilt:");
        int[] var3 = arr;
        int var4 = arr.length;

        int var5;
        int i;
        for(var5 = 0; var5 < var4; ++var5) {
            i = var3[var5];
            System.out.print("" + i + "  ");
        }

        System.out.println();
        Basic_Reverse(a);
        System.out.println("Sorting of Array within a Range:");
        Integer[] var7 = a;
        var4 = a.length;

        for(var5 = 0; var5 < var4; ++var5) {
            i = var7[var5];
            System.out.print("" + i + " ");
        }

        System.out.println();
    }
}
