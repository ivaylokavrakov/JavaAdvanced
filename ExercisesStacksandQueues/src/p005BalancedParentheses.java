import java.util.ArrayDeque;
import java.util.Scanner;

public class p005BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean isBalanced = false;

        for (Character chr : input.toCharArray()) {
            if (chr == '(' || chr == '{' || chr == '[') {
                stack.push(chr);
            } else if (chr == ')' || chr == '}' || chr == ']') {
                if (stack.isEmpty()){
                    isBalanced = false;
                    break;
                }
                char lastOpenedParen = stack.pop();

                if (lastOpenedParen == '(' && chr == ')') {
                    isBalanced = true;
                } else if (lastOpenedParen == '{' && chr == '}') {
                    isBalanced = true;
                } else if (lastOpenedParen == '[' && chr == ']') {
                    isBalanced = true;
                } else {
                    isBalanced = false;
                    break;
                }

            }

        }
        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
