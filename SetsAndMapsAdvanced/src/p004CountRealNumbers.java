import java.awt.image.ImageProducer;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p004CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] values = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> occurrences = new LinkedHashMap<>();
        for (Double value : values) {
            if (!occurrences.containsKey(value)) {
                occurrences.put(value, 1);

            }else {
                occurrences.put(value,occurrences.get(value)+1);
            }
        }
        for (Double key:occurrences.keySet()) {
            System.out.printf("%.1f -> %d%n",key,occurrences.get(key));
        }
    }
}
