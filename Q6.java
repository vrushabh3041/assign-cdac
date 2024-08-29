import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter dimensions of first matrix (rows columns): ");
        int rows1 = s.nextInt();
        int columns1 = s.nextInt();
        int[][] matrix1 = new int[rows1][columns1];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = s.nextInt();
            }
        }

        System.out.println("Enter dimensions of second matrix (rows columns): ");
        int rows2 = s.nextInt();
        int columns2 = s.nextInt();
        int[][] matrix2 = new int[rows2][columns2];

        if (columns1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = s.nextInt();
            }
        }

        int[][] product = new int[rows1][columns2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Product of matrices:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
       
    }
}
