import java.util.*;

public class p007HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        LinkedHashMap<String, Set<String>> cardsMap = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {
            String name = input.split(": ")[0];
            String[] cards = input.split(": ")[1].split(", ");


            for (int i = 0; i < cards.length; i++) {
                if (!cardsMap.containsKey(name)) {
                    cardsMap.put(name, new HashSet<>());
                    cardsMap.get(name).add(cards[i]);
                } else {
                    cardsMap.get(name).add(cards[i]);
                }

            }



            input = scanner.nextLine();
        }
        LinkedHashMap<String,Integer> finalMap = new LinkedHashMap<>();

        for (String name: cardsMap.keySet()) {
            Set<String> currentSet = cardsMap.get(name);
            int power =0;
            int type =0;
            int currentSum = 0;
            for (String currentCard: currentSet) {
                StringBuilder powerString = new StringBuilder(currentCard);
                powerString.deleteCharAt(currentCard.length()-1);
                String currentCardPower =String.valueOf(powerString);


                        if (currentCardPower.equals("J")) {
                        power = 11;
                        } else if (currentCardPower.equals("Q")) {
                        power = 12;
                        } else if (currentCardPower.equals("K")) {
                        power = 13;
                        } else if (currentCardPower.equals("A")) {
                        power = 14;
                        }else {
                            power = Integer.parseInt(currentCardPower);
                        }

                        if (currentCard.endsWith("S")) {
                        type = 4;
                        } else if (currentCard.endsWith("H")) {
                        type = 3;
                        } else if (currentCard.endsWith("D")) {
                        type = 2;
                        } else if (currentCard.endsWith("C")) {
                        type = 1;
                        }
                currentSum += power*type;
            }



            if (!finalMap.containsKey(name)){
                finalMap.put(name,currentSum);
            }else {
            finalMap.put(name,finalMap.get(name)+ currentSum);
            }
        }

        for (String name : finalMap.keySet()) {
            System.out.println(name + ": " + finalMap.get(name));
        }
    }
}

