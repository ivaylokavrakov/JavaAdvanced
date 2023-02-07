import java.util.Scanner;

public class p006Fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextInt();
        System.out.println(fact(number));

    }
    public  static long fact (long n){
        if (n==0){
            return 1;

        }else {
            return  fact(n-1)*n;
        }
    }
}
