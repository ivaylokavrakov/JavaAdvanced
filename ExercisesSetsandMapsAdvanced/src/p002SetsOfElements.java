import java.util.LinkedHashSet;
import java.util.Scanner;

public class p002SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]dimensions = scanner.nextLine().split(" ");
        int setSizeFirst = Integer.parseInt(dimensions[0]);
        int setSizeSecond = Integer.parseInt(dimensions[1]);
        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < setSizeFirst; i++) {
            int inputFirst = Integer.parseInt(scanner.nextLine());
            firstSet.add(inputFirst);
        }
        for (int i = 0; i < setSizeSecond; i++) {
            int inputSecond = Integer.parseInt(scanner.nextLine());
            secondSet.add(inputSecond);
        }
        for (Integer number: firstSet) {
            if (secondSet.contains(number)){
                System.out.print(number+" ");
            }
        }
//        firstSet.retainAll(secondSet);
//        firstSet.forEach(e-> System.out.println(e+" "));
    }
}
