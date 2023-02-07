import java.sql.SQLOutput;
import java.util.Scanner;

public class p006PrintDiagonalsOfSqMat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDimensions = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[numDimensions][numDimensions];

        for (int i = 0; i < numDimensions; i++) {
            String[] parts = scanner.nextLine().split(" ");
            for (int j = 0; j < numDimensions; j++) {
                matrix[i][j] = Integer.parseInt(parts[j]);
            }
        }
        int counter2 =0;
        for (int i = 0; i < numDimensions; i++) {
            System.out.print(matrix[counter2][counter2] + " ");
            counter2++;
            
        }
        System.out.println();
        int counter =0;
        for (int i = 0; i < numDimensions; i++) {

            System.out.print(matrix[numDimensions-1-counter][counter]+" ");
            counter++;
        }
    }
}
