import java.util.*;

public class p005AverageStudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsAndGrades = new TreeMap<>();


        for (int i = 0; i < numberOfInputs; i++) {
            String[] input = scanner.nextLine().split(" ");
            String student = input[0];
            double grade = Double.parseDouble(input[1]);

            if (!studentsAndGrades.containsKey(student)){
                studentsAndGrades.put(student,new ArrayList<>());
                studentsAndGrades.get(student).add(grade);
            }else {

                studentsAndGrades.get(student).add(grade);
            }
        }
        for (String name: studentsAndGrades.keySet()) {
            System.out.printf("%s -> ",name);
            double sum = 0;
            int counter = 0;
            for (int i = 0; i < studentsAndGrades.get(name).size(); i++) {
                System.out.printf("%.2f ", studentsAndGrades.get(name).get(i));
                sum += studentsAndGrades.get(name).get(i);
                counter++;
            }
            double average = sum/counter;
            System.out.printf("(avg: %.2f)",average);
            System.out.println();
        }
    }
}
