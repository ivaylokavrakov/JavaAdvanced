import java.util.Arrays;
import java.util.Scanner;

public class p005MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row = dimensions[0];
        int col = dimensions[1];

        String[][] matrix = new String[row][col];

        fillMatrix(matrix, scanner);

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            boolean isValidCommand = false;
            String[] inputArr = input.split(" ");
            if (inputArr.length==5){
                int row1 = Integer.parseInt(inputArr[1]);
                int col1 = Integer.parseInt(inputArr[2]);
                int row2 = Integer.parseInt(inputArr[3]);
                int col2 = Integer.parseInt(inputArr[4]);
                if (inputArr[0].equals("swap") &&
                        row1 >= 0 && row1 < row && col1 >= 0 && col1 < col && row2 >= 0 && row2 < row && col2 >= 0 && col2 < col) {
                    String value1 = matrix[row1][col1];
                    String value2 = matrix[row2][col2];
                    matrix[row1][col1] = value2;
                    matrix[row2][col2] = value1;
                    printMatrix(matrix);
                    isValidCommand = true;
                }

            }
            if (!isValidCommand){
                System.out.println("Invalid input!");
            }

            input = scanner.nextLine();
        }


    }

    public static void fillMatrix(String[][] matrix, Scanner scanner) {

        for (int i = 0; i < matrix.length; i++) {
            String[] rowData = scanner.nextLine().split(" ");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rowData[j];
            }
        }
    }

    public static void printMatrix(String[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
