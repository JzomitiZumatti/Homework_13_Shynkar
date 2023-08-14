import java.util.Random;
import java.util.Scanner;

public class MatrixTransposition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //Matrix dimension
        System.out.print("Input the matrix m value: "); //number of raw's
        int m = scanner.nextInt();
        System.out.print("Input the matrix n value: "); //number of column's
        int n = scanner.nextInt();

        int[][] firstMatrix = new int[m][n];
        int[][] secondMatrix = new int[n][m];

        System.out.println("\nMatrix which need to be transposed:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                firstMatrix[i][j] = random.nextInt(10) + 1;
                System.out.print(firstMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nResult of matrix transpose:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                secondMatrix[i][j] = firstMatrix[j][i];
                System.out.print(secondMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
