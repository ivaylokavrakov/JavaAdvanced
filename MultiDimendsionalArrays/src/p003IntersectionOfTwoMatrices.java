import java.util.Scanner;

public class p003IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        char[][] firstMatrix = new char[rows][cols];
        char[][] secondMatrix = new char[rows][cols];


        for (int i = 0; i < rows; i++) {
            String[] parts = scanner.nextLine().split("\\s+");
            for (int j = 0; j < cols; j++) {
                char currentChar = parts[j].charAt(0);
                firstMatrix[i][j] = currentChar;
            }
        }
        for (int i = 0; i < rows; i++) {
            String[] parts = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                char currentChar = parts[j].charAt(0);
                secondMatrix[i][j] = currentChar;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (firstMatrix[i][j] != secondMatrix[i][j]){
                    firstMatrix[i][j] = '*';
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
