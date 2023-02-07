import java.util.LinkedHashSet;
import java.util.Scanner;

public class p003VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputFirst = scanner.nextLine().split(" ");
        String[] inputSecond = scanner.nextLine().split(" ");

        LinkedHashSet<Integer> firstPlayer = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondPlayer = new LinkedHashSet<>();

        for (int i = 0; i < inputFirst.length; i++) {
           int current = Integer.parseInt(inputFirst[i]);
           firstPlayer.add(current);
        }
        for (int i = 0; i < inputSecond.length; i++) {
            int current = Integer.parseInt(inputSecond[i]);
            secondPlayer.add(current);
        }

        for (int i = 0; i < 50; i++) {
            int firstNumber = firstPlayer.iterator().next();
            int secondNumber = secondPlayer.iterator().next();

            firstPlayer.remove(firstNumber);
            secondPlayer.remove(secondNumber);
            if (firstNumber > secondNumber) {
                firstPlayer.add(firstNumber);
                firstPlayer.add(secondNumber);

            } else if (secondNumber > firstNumber) {
                secondPlayer.add(firstNumber);
                secondPlayer.add(secondNumber);
            }

            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()) {
                break;

            }
        }
        if (firstPlayer.size() > secondPlayer.size()) {
            System.out.println("First player win!");

        } else if (secondPlayer.size()> firstPlayer.size()) {
            System.out.println("Second player win!");
        }else {
            System.out.println("Draw!");
        }
    }
}
