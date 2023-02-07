import java.util.ArrayDeque;
import java.util.Scanner;

public class p003DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String result = "";
        if (num<0){
            System.out.println("Cannot handle negative integers.");
            return;
        }
        if (num==0){
            System.out.println("0");
            return;
        }
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while (num > 0) {
            int bit = num%2;
            stack.push(bit);

            num = num/2;

        }
        while (!stack.isEmpty()){

            System.out.print(stack.pop());
        }
    }
}
