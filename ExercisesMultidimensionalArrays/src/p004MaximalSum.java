import java.util.Arrays;
import java.util.Scanner;

public class p004MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] matrix = new int[rows][cols];

        fillMatrix(matrix,scanner);
        findMaximumSum(matrix);

    }

    private static void findMaximumSum(int[][] matrix) {

        int maxSum = 0;
        int row =0;
        int col = 0;

        for (int i = 0; i < matrix.length - 2; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length-2; j++) {
                int first = matrix[i][j];
                int second = matrix[i][j+1];
                int third = matrix[i][j+2];
                int fourth = matrix[i+1][j];
                int fifth = matrix[i+1][j+1];
                int sixth = matrix[i+1][j+2];
                int seventh = matrix[i+2][j];
                int eight = matrix[i+2][j+1];
                int ninth = matrix[i+2][j+2];

                sum += first+second+third+fourth+fifth+sixth+seventh+eight+ninth;
                if (sum>maxSum){
                    maxSum = sum;
                    row = i;
                    col = j;
                }
                sum= 0;
            }
        }
        System.out.println("Sum = "+ maxSum);
        printSqr3Matrix(matrix,row,col);
    }

    public static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            int[] rowData = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rowData[j];
            }
        }
    }
    public static void printSqr3Matrix(int[][] matrix,int row,int col) {
        for (int i   = row; i < row+3; i++) {
            for (int j = col; j < col+3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
