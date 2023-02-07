import java.util.HashMap;
import java.util.Scanner;

public class p005PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        HashMap<String,String> phoneBook = new HashMap<>();
        while (!input.equals("search")) {
            String name = input.split("-")[0];
            String number = input.split("-")[1];

                phoneBook.put(name,number);

            input = scanner.nextLine();

        }
        String nameSearch = scanner.nextLine();
        while (!nameSearch.equals("stop")){
            if (!phoneBook.containsKey(nameSearch)){
                System.out.printf("Contact %s does not exist.%n",nameSearch);

            }else {
                System.out.printf("%s -> %s%n",nameSearch,phoneBook.get(nameSearch));
            }

            nameSearch = scanner.nextLine();
        }
    }
}
