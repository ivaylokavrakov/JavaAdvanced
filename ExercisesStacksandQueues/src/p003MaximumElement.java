import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class p003MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numberOfCommands; i++) {
            int command = scanner.nextInt();


            if (command == 1){
                int element = scanner.nextInt();
                stack.push(element);
            } else if (command==2) {
                stack.pop();

            } else if (command==3) {
                System.out.println(Collections.max(stack));
            }
        }
    }
}
