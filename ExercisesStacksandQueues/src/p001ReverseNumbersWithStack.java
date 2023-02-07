import java.util.*;

public class p001ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stackNumber = new ArrayDeque<>();


        for (String number: inputArr) {
            stackNumber.push(number);
        }

        while (!stackNumber.isEmpty()){
            System.out.print(stackNumber.pop()+ " ");
        }
    }
}
