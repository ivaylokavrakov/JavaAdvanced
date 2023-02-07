import java.util.Arrays;
import java.util.Scanner;

public class p002PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensionsMatrix = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rows = dimensionsMatrix[0];
        int cols = dimensionsMatrix[1];
        int[][] matrix = new int[rows][cols];

        fillMatrix(matrix, scanner);

        int object = Integer.parseInt(scanner.nextLine());
        containsObject(matrix, object);
    }

    public static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            int[] rowData = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rowData[j];
            }
        }
    }

    public static void containsObject(int[][] matrix, int obj) {
        boolean isFound = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == obj) {
                    System.out.println(i + " " + j);
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("not found");
        }
    }
}
