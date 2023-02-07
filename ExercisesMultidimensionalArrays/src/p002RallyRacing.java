import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p002RallyRacing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String number = scanner.nextLine();

        String[][] trace = new String[n][n];
        fillMatrix(trace, scanner);

        int currentRow = 0;
        int currentCol = 0;
        List<Integer> tunnelCord = new ArrayList<>();
        int km = 0;
        findTunnels(trace,tunnelCord);
        String directions = scanner.nextLine();
        int countTunnels = 0;
        while (!directions.equals("End")){
            switch (directions){
                case "left":
                    currentCol--;
                    break;
                case "right":
                    currentCol++;
                    break;

                case "up":
                    currentRow--;
                    break;

                case "down":
                    currentRow++;
                    break;

            }
            String currentLocation = trace[currentRow][currentCol];
            if (".".equals(currentLocation)) {
                km += 10;
            } else if ("F".equals(currentLocation)) {
                System.out.printf("Racing car %s finished the stage!%n", number);
                km += 10;
                break;
            } else if ("T".equals(currentLocation)) {
                countTunnels++;
                km += 30;
                if (countTunnels==1){
                    trace[currentRow][currentCol] = ".";
                    currentRow = tunnelCord.get(2);
                    currentCol =tunnelCord.get(3);
                    trace[currentRow][currentCol] = ".";
                }else {
                    trace[currentRow][currentCol] = ".";
                    currentRow = tunnelCord.get(0);
                    currentCol =tunnelCord.get(1);
                    trace[currentRow][currentCol] = ".";
                }
            }


            directions = scanner.nextLine();
        }
        if (directions.equals("End")){
            System.out.printf("Racing car %s DNF.%n",number);

        }
        System.out.printf("Distance covered %d km.%n",km);
        trace[currentRow][currentCol] = "C";
        printStringMatrix(trace);


    }

    public static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");

        }
    }

    public static void findTunnels(String[][] matrix, List<Integer> tunerCord) {
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j].equals("T")){
                    tunerCord.add(i);
                    tunerCord.add(j);
                }
            }
        }


    }
    public static void printStringMatrix(String[][] matrix) {
        for (int i   = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
