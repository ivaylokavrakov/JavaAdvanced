import java.util.Scanner;

public class p005MaximumSubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];
        int sum = 0;
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;

        for (int i = 0; i < rows; i++) {
            String[] parts = scanner.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(parts[j]);
            }
        }
        for (int i = 0; i < rows-1; i++) {
            for (int j = 0; j < cols-1; j++) {
                int currentNum = matrix[i][j];
                int currentNum2 = matrix[i+1][j];
                int currentNum3 = matrix[i+1][j+1];
                int currentNum4 = matrix[i][j+1];
                int currentSum = currentNum+currentNum2+currentNum3+currentNum4;
                if (currentSum>sum){
                    sum=currentSum;
                    number1 = currentNum;
                    number2 = currentNum2;
                    number3 = currentNum3;
                    number4 = currentNum4;
                }
            }
        }
        System.out.println(number1 + " " + number4);
        System.out.println(number2 + " " + number3);
        System.out.println(sum);


    }
}
