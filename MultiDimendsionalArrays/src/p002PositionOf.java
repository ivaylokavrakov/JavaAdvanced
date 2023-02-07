import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class p002PositionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFound = false;

        String[] dimensions = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int [][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] parts = (scanner.nextLine().split(" "));
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(parts[j]);
            }
        }
        int numberToBeFound = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int currentNum = matrix[i][j];
                if (numberToBeFound == currentNum){
                    System.out.println(i +" "+j);
                    isFound = true;
                }
            }
        }
        if (!isFound){
            System.out.println("not found");
        }
    }
}
