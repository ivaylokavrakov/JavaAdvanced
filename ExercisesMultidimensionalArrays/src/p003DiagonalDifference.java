import java.util.Arrays;
import java.util.Scanner;

public class p003DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimensions = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[dimensions][dimensions];

        fillMatrix(matrix, scanner);
findDiffInDiagonalsSum(matrix);

    }

    public static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            int[] rowData = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rowData[j];
            }
        }
    }

    public static void findDiffInDiagonalsSum(int[][] matrix) {
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        int count = 0;
        for (int i = matrix.length-1; i >=0 ; i--) {
            sum2 += matrix[i][count];
            count++;
        }
        int diff = Math.abs(sum-sum2);
        System.out.println(diff);
    }
}
