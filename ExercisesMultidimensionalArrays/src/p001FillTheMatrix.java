import java.util.Scanner;

public class p001FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String type = input[1];
        int starter = 1;


        int[][] matrix = new int[n][n];

        if (type.equals("A")) {
            for (int cols = 0; cols < n; cols++) {
                for (int rows = 0; rows < n; rows++) {


                    matrix[rows][cols] = starter;

                    starter++;
                }

            }


        } else if (type.equals("B")) {
            for (int cols = 0; cols < n; cols++) {

                if (cols % 2 == 0) {
                    for (int rows = 0; rows < n; rows++) {
                        matrix[rows][cols] = starter;
                        starter++;
                    }


                } else {
                    for (int rows = n - 1; rows >= 0; rows--) {
                        matrix[rows][cols] = starter;
                        starter++;
                    }

                }
            }
        }


        printMatrix(matrix);


    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
