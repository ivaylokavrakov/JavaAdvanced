import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class p007HotPotatoUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split("\\s+");
        int numberCycles = Integer.parseInt(scanner.nextLine());

        PriorityQueue<String> kids = new PriorityQueue<>();
        Collections.addAll(kids, names);
        int cycle = 1;

        while(kids.size()>1){
            for (int i = 1; i < numberCycles; i++) {
                String currentKid = kids.poll();
                kids.offer(currentKid);

            }
            if (isPrime(cycle)){
                String primeKid = kids.poll();
                System.out.println("Prime " + primeKid);
                kids.offer(primeKid);

            }else {
                String removedChild = kids.poll();
                System.out.println("Removed " + removedChild);

            }
            cycle++;

        }
        System.out.println("Last is "+ kids.poll());


    }



    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
