    import java.util.Scanner;

    public class p001CompareMatrices {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] input = scanner.nextLine().split(" ");
            boolean equalCheck = true;

            int firstRows = Integer.parseInt(input[0]);
            int firstCols = Integer.parseInt(input[1]);

            int[][] firstMatrix = new int[firstRows][firstCols];

            for (int i = 0; i < firstRows; i++) {
                String[] parts = scanner.nextLine().split(" ");

                for (int j = 0; j < firstCols; j++) {
                    firstMatrix[i][j] = Integer.parseInt(parts[j]);

                }
            }
            String[] inputDimensions2 = scanner.nextLine().split(" ");

            int secondRows = Integer.parseInt(inputDimensions2[0]);
            int secondCols = Integer.parseInt(inputDimensions2[1]);

            int[][] secondMatrix = new int[secondRows][secondCols];

            for (int i = 0; i < secondRows; i++) {
                String[] parts = scanner.nextLine().split(" ");

                for (int j = 0; j < secondCols; j++) {
                    secondMatrix[i][j] = Integer.parseInt(parts[j]);

                }
            }
            if (firstRows != secondRows || firstCols != secondCols) {
                equalCheck = false;
            }else{
                for (int i = 0; i < firstRows; i++) {
                    for (int j = 0; j < firstCols; j++) {
                        if (firstMatrix[i][j] != secondMatrix[i][j]) {
                            equalCheck = false;
                        }
                    }
                }

            }


            if (equalCheck) {
                System.out.println("equal");
            } else {
                System.out.println("not equal");
            }


        }
    }
