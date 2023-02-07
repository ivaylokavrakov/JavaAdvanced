import java.util.LinkedHashMap;
import java.util.Scanner;

public class p006FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String,String> emailMap = new LinkedHashMap<>();
        while (!input.equals("stop")){
            String name = input;
            String email = scanner.nextLine();



            if (!email.endsWith(".us") && !email.endsWith(".uk") && !email.endsWith("com")){
                emailMap.put(name,email);
            }

            input = scanner.nextLine();
        }
        for (String name:emailMap.keySet()) {
            System.out.println(name +" -> "+emailMap.get(name));
        }

    }
}
