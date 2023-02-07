import java.util.ArrayDeque;
import java.util.Scanner;

public class p007SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        ArrayDeque<String> stack = new ArrayDeque<>();

        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfCommands; i++) {
            String[] commandParts = scanner.nextLine().split("\\s+");
            String command = commandParts[0];


            switch (command) {
                case "1":
                    stack.push(String.valueOf(text));
                    String argument = commandParts[1];
                    text.append(argument);


                    break;
                case "2":
                    int countDelete = Integer.parseInt(commandParts[1]);
                    stack.push(String.valueOf(text));
                    text.delete(text.length() - countDelete, text.length());


                    break;
                case "3":
                    int indexReturn = Integer.parseInt(commandParts[1]);
                    char returnSymbol = text.charAt(indexReturn-1);
                    System.out.println(returnSymbol);

                    break;
                case "4":
                    if (!stack.isEmpty()){

                        text = new StringBuilder(stack.pop());
                    }



                    break;
            }

        }
    }
}
