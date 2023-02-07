import java.io.*;

public class p005WriteEveryThirdLIne {
    public static void main(String[] args) {

        String basePath = "C:\\Users\\Monika\\Desktop\\Java Advanced\\resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\output.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             PrintStream writer = new PrintStream(new FileOutputStream(outputPath))) {
            int count = 1;
            String line = reader.readLine();
            while (line != null) {

                if (count % 3 == 0) {
                    writer.println(line);

                }
                count++;
                line = reader.readLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
