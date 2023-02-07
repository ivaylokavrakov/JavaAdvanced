import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class p001ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Set<String> parking = new LinkedHashSet<>();
        while (!input.equals("END")){
            String[] parts = input.split(", ");

            String direction = parts[0];
            String carNumber = parts[1];
            if (direction.equals("IN")){
                parking.add(carNumber);
            } else if (direction.equals("OUT")) {
                parking.remove(carNumber);
            }
            input = scanner.nextLine();
        }
        if (parking.isEmpty()){
            System.out.println("Parking Lot is Empty");

        }else {
            parking.forEach(car -> System.out.println(car));
        }

        }


    }

