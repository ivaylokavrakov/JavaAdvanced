import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

public class p008AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        Map<String,double[]> studentsMap = new TreeMap<>();
        for (int i = 0; i < numberOfStudents; i++) {
            String name = scanner.nextLine();
            String[] grades = scanner.nextLine().split(" ");
            double[] grade = new double[grades.length];

            for (int j = 0; j < grades.length; j++) {
                grade[j] = Double.parseDouble(grades[j]);
            }
            studentsMap.put(name,grade);

        }
        for (String name : studentsMap.keySet()) {

            double averagescore = 0;
            for (int i = 0; i < studentsMap.get(name).length; i++) {
                averagescore += studentsMap.get(name)[i];
            }
            DecimalFormat decimalFormat = new DecimalFormat("0.####");
            averagescore = averagescore/studentsMap.get(name).length;
            BigDecimal stripedVal = new BigDecimal(averagescore).stripTrailingZeros();
            double doubleValue = stripedVal.doubleValue();
            System.out.println(name + " is graduated with "+ doubleValue);
        }
    }
}
