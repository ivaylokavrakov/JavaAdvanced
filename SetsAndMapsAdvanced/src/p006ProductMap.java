import java.sql.Array;
import java.util.*;

public class p006ProductMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Map<String,Double>> productMap = new TreeMap<>();

        while (!input.equals("Revision")) {
            String[] parts = input.split(", ");
            String store = parts[0];
            String product = parts[1];
            double price = Double.parseDouble(parts[2]);
            if (!productMap.containsKey(store)) {
            productMap.put(store,new LinkedHashMap<>());
            productMap.get(store).put(product,price);


            }else {
                productMap.get(store).put(product,price);

            }

            input = scanner.nextLine();

        }
        for (String store:productMap.keySet()) {
            System.out.println(store+ "->");
            for (String product : productMap.get(store).keySet()) {
                System.out.printf("Product: %s, Price: %.1f%n",product,productMap.get(store).get(product));

            }

        }
    }
}
