import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p006StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rotation = scanner.nextLine();

        int angleRotation = Integer.parseInt(rotation.split("[()]+")[1]) % 360;
        String input = scanner.nextLine();
        ArrayList<String> linesForMatrix = new ArrayList<>();
        int maxLength = 0;

        while (!input.equals("END")) {
            linesForMatrix.add(input);
            if (input.length()>maxLength) {
                maxLength = input.length();
            }
            input = scanner.nextLine();
        }
        int rows = linesForMatrix.size();
        int cols = maxLength;

        char[][] matrix = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j<linesForMatrix.get(i).length()){
                    matrix[i][j] = linesForMatrix.get(i).charAt(j);
                }else {
                    matrix[i][j] = ' ';
                }
            }
        }

rotateMatrix(angleRotation,matrix,rows,cols);
    }

    private static void rotateMatrix(int angleRotation, char[][] matrix, int rows, int cols) {
        if (angleRotation==90){

            for (int i = 0; i <cols; i++) {
                for (int j = rows-1; j >=0 ; j--) {
                    System.out.print(matrix[j][i]);
                }
                System.out.println();
            }
            
        } else if (angleRotation==180) {
            for (int i = rows-1; i >=0; i--) {
                for (int j = cols-1; j >= 0; j--) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        } else if (angleRotation==270) {
            for (int i = cols-1; i >=0 ; i--) {
                for (int j = 0; j < rows; j++) {
                    System.out.print(matrix[j][i]);
                }
                System.out.println();
            }
            
        } else  {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        }


    }
}