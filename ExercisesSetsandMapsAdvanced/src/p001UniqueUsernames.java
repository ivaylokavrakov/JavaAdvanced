import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class p001UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(scanner.nextLine());
        HashSet<String> uniqueUsernames = new LinkedHashSet<>();

        for (int i = 0; i < numberOfInputs; i++) {
            String usernames = scanner.nextLine();
            uniqueUsernames.add(usernames);
        }
        for (String username : uniqueUsernames) {
            System.out.println(username);
        }
       // uniqueUsernames.forEach(System.out::println);
    }
}
