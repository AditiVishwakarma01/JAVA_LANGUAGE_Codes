import java.util.*;

public class Spiral_Matrix{

    public static void Spiral(int[][] matrix){
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while(startrow <= endrow && startcol <= endcol) {

            //top

            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j]+" ");
            }

            //right

            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol]+" ");
            }

            //bottom

            for (int j = endcol - 1; j >= startcol; j--) {
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }

            //left

            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--;

        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            int n,m;

            System.out.println("Enter the rows of the matrix: ");
            n = sc.nextInt();

            System.out.println("Enter the columns of the matrix: ");
            m = sc.nextInt();

            int[][] matrix = new int[n][m];


            System.out.println("Enter the elements of Matrix: ");
            for(int i = 0;i<n;i++){
                for(int j = 0;j<m;j++){
                    matrix[i][j] = sc.nextInt();
                }
            }

            System.out.println("Matrix Display : ");
            for(int i = 0;i<n;i++){
                for(int j = 0;j<m;j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }


            Spiral(matrix);
        }

    }

