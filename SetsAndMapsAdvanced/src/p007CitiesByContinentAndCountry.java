import java.sql.SQLOutput;
import java.util.*;

public class p007CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, List<String>>> locationMap = new LinkedHashMap<>();

        int numberOfInputs = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        for (int i = 0; i < numberOfInputs; i++) {
            String[] parts = input.split("\\s+");
            String continent = parts[0];
            String country = parts[1];
            String city = parts[2];
            if (!locationMap.containsKey(continent)) {

                locationMap.put(continent, new LinkedHashMap<>());
                locationMap.get(continent).put(country, new ArrayList<>());
                locationMap.get(continent).get(country).add(city);
            } else {
                if (!locationMap.get(continent).containsKey(country)) {
                    locationMap.get(continent).put(country, new ArrayList<>());
                    locationMap.get(continent).get(country).add(city);
                } else {


                locationMap.get(continent).get(country).add(city);

                }
            }
            if (i!=numberOfInputs-1){
                input = scanner.nextLine();
            }

        }

        for (String cont :locationMap.keySet()) {
            System.out.println(cont+":");
            for (String country:locationMap.get(cont).keySet()) {
                System.out.print(country+" -> ");
                System.out.print(String.join(", ", locationMap.get(cont).get(country)));
                System.out.println();
            }

        }
    }
}
