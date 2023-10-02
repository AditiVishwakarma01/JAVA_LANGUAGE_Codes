import java.util.*;

public class Diagonal_Sum {
    public static int diagonal_sum(int[][] matrix){

        //diagonal sum of matrix - primary diagonal(left diagonal) , secondary diagonal(right diagonal).
        int sum = 0;

        for(int i = 0; i<matrix.length;i++){
            sum = sum + matrix[i][i];

            if(i != matrix.length-1-i)
                sum = sum + matrix[i][matrix.length-i-1];

        }
        return sum;        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,m;
        System.out.println("Enter the number of Rows: ");
        n = sc.nextInt();

        System.out.println("Enter the number of Columns: ");
        m = sc.nextInt();

        int[][] matrix = new int[n][m];

        //input

        System.out.println("Enter the Elements of Matrix: ");
        for(int i =0;i<n;i++){
            for(int j = 0; j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //display

        System.out.println("Display of Matrix: ");
        for(int i =0;i<n;i++){
            for(int j = 0; j<m;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        diagonal_sum(matrix);

    }
}
