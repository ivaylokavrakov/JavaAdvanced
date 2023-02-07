import java.util.Arrays;
import java.util.Scanner;

public class p002MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];
        String[][] matrix = new String[rows][cols];
        fillMatrixPalindrome(matrix);
        printStringMatrix(matrix);


    }

    public static void fillMatrixPalindrome(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                char firstLetter = (char) (97 + i);
                char secondLetter = (char) (97 + i + j);
                StringBuilder strB = new StringBuilder();
                strB.append(firstLetter);
                strB.append(secondLetter);
                strB.append(firstLetter);
                matrix[i][j] = String.valueOf(strB);
            }
        }
    }

    public static void printStringMatrix(String[][] matrix) {
        for (int i   = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
