import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class p006HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] childrenNames = scanner.nextLine().split("\\s+");
        int steps =Integer.parseInt(scanner.nextLine());


        ArrayDeque<String> kids = new ArrayDeque<>();
        Collections.addAll(kids, childrenNames);

        while(kids.size()>1){
            for (int i = 1; i < steps; i++) {
                String kid = kids.poll();
                kids.offer(kid);
            }


            String removedChild = kids.poll();
            System.out.println("Removed " + removedChild);

        }
        System.out.println("Last is "+ kids.poll());
    }
}
