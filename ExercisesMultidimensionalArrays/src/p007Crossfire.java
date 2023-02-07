import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p007Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int row = dimensions[0];
        int col = dimensions[1];


        String input = scanner.nextLine();

        List<List<Integer>> matrix = new ArrayList<>();

        fillMatrixForCrossFire(matrix, row, col);


        while (!input.equals("Nuke it from orbit")) {
            String[] inputArr = input.split(" ");
            int rowFire = Integer.parseInt(inputArr[0]);
            int colFire = Integer.parseInt(inputArr[1]);
            int powerFire = Integer.parseInt(inputArr[2]);
            for (int i = rowFire - powerFire; i <= rowFire + powerFire; i++) {
                if (isInMatrix(i, colFire, matrix)) {
                    matrix.get(i).remove(colFire);

                }
            }
            for (int i = colFire + powerFire; i >= colFire - powerFire; i--) {
                if (isInMatrix(rowFire, i, matrix)) {
                    matrix.get(rowFire).remove(i);

                }
            }
            matrix.removeIf(List::isEmpty);


            input = scanner.nextLine();
        }
        printIntMatrix(matrix);


    }

    private static boolean isInMatrix(int row,int col ,List<List<Integer>> matrix) {
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();


    }

    public static void fillMatrixForCrossFire(List<List<Integer>> matrix, int rows, int cols) {
        int number = 1;
        for (int i = 0; i < rows; i++) {
            matrix.add(new ArrayList<>());
            for (int j = 0; j < cols; j++) {
                matrix.get(i).add(number++);
            }
        }
    }

    public static void printIntMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
