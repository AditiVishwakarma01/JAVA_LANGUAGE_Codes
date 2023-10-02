import java.util.*;

public class Two_D_Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3] [3];
        int n = 3, m = 3;

        for(int i =0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("The index is :" + i + " " + j);
            }
            System.out.println();
        }
    }
}

