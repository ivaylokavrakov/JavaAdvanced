import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class p004ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        // изважда инт които не са част от др дума.

        String basePath = "C:\\Users\\Monika\\Desktop\\Java Advanced\\resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\output.txt";

        Scanner reader = new Scanner(new FileInputStream(inputPath));

        PrintStream writer = new PrintStream(new FileOutputStream(outputPath));
        while (reader.hasNext()) {
            if (reader.hasNextInt()) {
                writer.println(reader.nextInt());

            }
            reader.next();
        }

    }
}
