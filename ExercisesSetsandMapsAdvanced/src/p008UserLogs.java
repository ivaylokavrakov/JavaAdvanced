import com.sun.source.tree.Tree;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class p008UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        TreeMap<String, LinkedHashMap<String, Integer>> userMap = new TreeMap<>();

        while (!input.equals("end")) {
            String ip = input.split("\\s+")[0].split("=")[1];
            String message = input.split("\\s+")[1].split("=")[1];
            String username = input.split("\\s+")[2].split("=")[1];

            if (!userMap.containsKey(username)) {
                userMap.put(username, new LinkedHashMap<>());
                userMap.get(username).put(ip, 1);
            } else {
                if (!userMap.get(username).containsKey(ip)) {
                    userMap.get(username).put(ip, 1);
                } else {
                    userMap.get(username).put(ip, userMap.get(username).get(ip) + 1);
                }

            }


            input = scanner.nextLine();
        }
        for (String user : userMap.keySet()) {
            System.out.println(user + ": ");
            int countIps = userMap.get(user).size();

            for (String ip : userMap.get(user).keySet()) {
                if (countIps == 1) {
                    System.out.println(ip + " => " + userMap.get(user).get(ip) + ".");
                } else {
                    System.out.print(ip + " => " + userMap.get(user).get(ip) + ", ");
                }

                countIps --;

            }

        }
    }
}
