import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in); // Scanner named s1

        // Read matrix dimensions
        int m = s1.nextInt();
        int n = s1.nextInt();

        // Initialize matrices
        int[][] matrixA = new int[m][n];
        int[][] matrixB = new int[m][n];
        int[][] additionResult = new int[m][n];
        int[][] subtractionResult = new int[m][n];

        // Read Matrix A
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = s1.nextInt();
            }
        }

        // Read Matrix B
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixB[i][j] = s1.nextInt();
            }
        }

        // Perform Addition and Subtraction
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                additionResult[i][j] = matrixA[i][j] + matrixB[i][j];
                subtractionResult[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        // Print Addition Result
        System.out.println("Matrix after Addition");
        printMatrix(additionResult);

        // Print Subtraction Result
        System.out.println("Matrix after Subtraction");
        printMatrix(subtractionResult);

        s1.close();
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

