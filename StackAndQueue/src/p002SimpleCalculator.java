import java.util.*;

public class p002SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] expressionParts = expression.split(" ");
        List<String> partsList = Arrays.asList(expressionParts);

        Collections.reverse(partsList);
        for (String part : partsList) {
            stack.push(part);

        }
        while (stack.size()>1){
            int first = Integer.parseInt(stack.pop());
            String operation = stack.pop();
            int second = Integer.parseInt(stack.pop());
            int result = 0;
            switch (operation){
                case"+":result = first + second; break;
                case"-":result = first - second; break;
                default:
                    System.out.println("Unknown Operation" + operation);
                    return;
            }
            stack.push(""+ result);
        }
        System.out.println(stack.peek());

    }
}
