import java.util.Scanner;
import java.util.TreeSet;

public class p003PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countElements = Integer.parseInt(scanner.nextLine());
        TreeSet<String> elements = new TreeSet<>();

        for (int i = 1; i <= countElements; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (String elem : input) {
                elements.add(elem);
            }


        }
        elements.forEach(e-> System.out.print(e+" "));
    }
}
