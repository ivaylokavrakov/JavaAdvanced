import java.util.Scanner;

public class p008WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rows][];
        int cols = 0;


        for (int i = 0; i < rows; i++) {

            String[] columData = scanner.nextLine().split(" ");
            cols = columData.length;
            int[] currentRow = new int[cols];


            for (int j = 0; j < columData.length; j++) {
                currentRow[j] = Integer.parseInt(columData[j]);
            }
            matrix[i] = currentRow;
        }
        int[][] matrixFinal = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixFinal[i][j] = matrix[i][j];
            }
        }

        String[] wrongData = scanner.nextLine().split(" ");
        int wrongRow = Integer.parseInt(wrongData[0]);
        int wrongCol = Integer.parseInt(wrongData[1]);
        int wrongValue = matrix[wrongRow][wrongCol];


        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == wrongValue) {
                    int sumRows = 0;
                    int sumCols = 0;

                    if (i == 0) {
                        if (matrix[i + 1][j] != wrongValue) {
                            sumRows = matrix[i + 1][j];
                        }

                    } else if (i == rows - 1) {
                        if (matrix[i - 1][j] != wrongValue) {
                            sumRows = matrix[i - 1][j];
                        }

                    } else {
                        if (matrix[i - 1][j] != wrongValue) {
                            sumRows = matrix[i - 1][j];
                        }
                        if (matrix[i + 1][j] != wrongValue) {
                            sumRows += matrix[i + 1][j];
                        }


                    }
                    if (j == 0) {
                        if (matrix[i][j + 1] != wrongValue) {
                            sumCols = matrix[i][j + 1];
                        }

                    } else if (j == cols - 1) {
                        if (matrix[i][j - 1] != wrongValue) {
                            sumCols = matrix[i][j - 1];
                        }

                    } else {
                        if (matrix[i][j - 1] != wrongValue) {
                            sumCols = matrix[i][j - 1];
                        }
                        if (matrix[i][j + 1] != wrongValue) {
                            sumCols += matrix[i][j + 1];
                        }

                    }
                    sum = sumCols + sumRows;
                    matrixFinal[i][j] = sum;

                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrixFinal[i][j] + " ");
            }
            System.out.println();
        }

    }
}
