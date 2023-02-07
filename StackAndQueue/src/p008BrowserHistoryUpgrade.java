import java.util.ArrayDeque;
import java.util.Scanner;

public class p008BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stackUrl = new ArrayDeque<>();
        ArrayDeque<String> stackUrlForward = new ArrayDeque<>();

        String input = scanner.nextLine();

        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (stackUrl.size() > 1) {

                    stackUrlForward.push(stackUrl.pop());
                    System.out.println(stackUrl.peek());

                } else {
                    System.out.println("no previous URLs");
                }


            } else if (input.equals("forward")) {

                if (stackUrlForward.isEmpty()) {
                    System.out.println("no next URLs");

                } else {
                    stackUrl.push(stackUrlForward.pop());
                    System.out.println(stackUrl.peek());
                }


            } else {
                stackUrlForward.clear();
                stackUrl.push(input);
                System.out.println(input);

            }


            input = scanner.nextLine();
        }
    }
}
