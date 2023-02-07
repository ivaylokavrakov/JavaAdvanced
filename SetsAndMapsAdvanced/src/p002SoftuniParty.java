import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class p002SoftuniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Set<String> guestsSet = new TreeSet<>();


        while (!input.equals("PARTY")) {
            guestsSet.add(input);
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("END")){
            guestsSet.remove(input);
            input = scanner.nextLine();
        }
        System.out.println(guestsSet.size());
        for (String guest:guestsSet) {
            System.out.println(guest);
        }
    }
}
