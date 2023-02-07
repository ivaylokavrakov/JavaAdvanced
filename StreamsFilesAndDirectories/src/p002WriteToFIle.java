import java.io.*;
import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class p002WriteToFIle {
    public static void main(String[] args) throws IOException {
//четем файл и изваждаме опр чарове от него

        String basePath = "C:\\Users\\Monika\\Desktop\\Java Advanced\\resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\output.txt";
        List<Character> punctuation = Arrays.asList(',', '.', '!', '?');

        OutputStream outputStream = new FileOutputStream(outputPath);


        try (InputStream inputStream = new FileInputStream(inputPath)) {
            int readByte = inputStream.read();
            while (readByte >= 0) {
                if (!punctuation.contains((char) readByte)) {
                    outputStream.write(readByte);
                }

                readByte = inputStream.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        outputStream.close();
    }
}
