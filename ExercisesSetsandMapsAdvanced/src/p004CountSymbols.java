import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class p004CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<Character, Integer> symbolMap = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
        char currentSym =input.charAt(i);

            if (!symbolMap.containsKey(currentSym)) {
                symbolMap.put(currentSym, 1);
            } else {
                symbolMap.put(currentSym, symbolMap.get(currentSym) + 1);
            }

        }
        for (Character symb : symbolMap.keySet()) {
            System.out.println(symb + ": " + symbolMap.get(symb) + " time/s");
        }
    }
}
