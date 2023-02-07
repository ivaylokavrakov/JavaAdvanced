import java.util.*;

public class p007RealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[8][8];

        for (int i = 0; i < 8; i++) {
            String[] parts = scanner.nextLine().split(" ");
            for (int j = 0; j < 8; j++) {
                matrix[i][j] = parts[j].charAt(0);
            }
        }
        Map<Integer, Integer> rowMap = new HashMap<>();

        for (int i = 0; i < 8; i++) {
            int counter = 0;
            int row = 0;
            int col = 0;
            for (int j = 0; j < 8; j++) {
                if (matrix[i][j] == 'q') {
                    row = i;
                    col = j;


                    counter++;
                }


            }
            if (counter == 1) {
                rowMap.put(row, col);
            }
        }
        Map<Integer, Integer> colMap = new HashMap<>();
        for (int i = 0; i < 8; i++) {
            int counter = 0;
            int row = 0;
            int col = 0;
            for (int j = 0; j < 8; j++) {
                if (matrix[j][i] == 'q') {
                    row = j;
                    col = i;
                    counter++;
                }


            }
            if (counter == 1) {
                colMap.put(row, col);
            }
        }
        Map<Integer, Integer> diagMap = new HashMap<>();
        boolean  diagTrue = false;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrix[i][j]=='q'){
                    while(i>0 && j>0 && i<7 && j<7){
                        i++;
                        j++;
                        if (matrix[i][j]=='q'){
                            diagTrue = false;
                            break;
                        }else {
                            diagTrue = true;
                        }
                    }
                    while(i>0 && j>0 && i<7 && j<=7){
                        i--;
                        j--;
                        if (matrix[i][j]=='q'){
                            diagTrue = false;
                            break;
                        }else {
                            diagTrue = true;
                        }
                    }
                    while(i>0 && j>0 && i<7 && j<7){
                        i++;
                        j--;
                        if (matrix[i][j]=='q'){
                            diagTrue = false;
                            break;
                        }else {
                            diagTrue = true;
                        }
                    }
                    while(i>0 && j>0 && i<7 && j<7){
                        i--;
                        j++;
                        if (matrix[i][j]=='q'){
                            diagTrue = false;
                            break;
                        }else {
                            diagTrue = true;
                        }
                    }
                }
                if (diagTrue){
                    diagMap.put(i,j);
                }
            }
        }


        if (colMap.size() >= rowMap.size()) {
            for (Map.Entry<Integer, Integer> entry : colMap.entrySet()) {
                if (rowMap.containsKey(entry.getKey()) && diagMap.containsKey(entry.getKey())) {
                    int test = rowMap.get(entry.getKey());
                    int test2 = entry.getValue();
                    int test3 = diagMap.get(entry.getKey());
                    if (test == test2 || test == test3) {
                        System.out.println(entry.getKey() + " " + entry.getValue());
                    }
                }
            }
        } else {
            for (Map.Entry<Integer, Integer> entry : rowMap.entrySet()) {
                if (colMap.containsKey(entry.getKey())&& diagMap.containsKey(entry.getKey())) {
                    int test = colMap.get(entry.getKey());
                    int test2 = entry.getValue();
                    int test3 = diagMap.get(entry.getKey());
                    if (test == test2 || test == test3) {
                        System.out.println(entry.getKey() + " " + entry.getValue());
                    }
                }
            }

        }


    }
}
