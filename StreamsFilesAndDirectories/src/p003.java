import java.io.*;

public class p003 {
    public static void main(String[] args) {
//преобразува текста в Инт..и запазва space i nov red.
        String basePath = "C:\\Users\\Monika\\Desktop\\Java Advanced\\resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\output.txt";

        try (InputStream inputStream = new FileInputStream(inputPath);
             OutputStream outputStream = new FileOutputStream(outputPath)) {
            int readByte = inputStream.read();

            while (readByte >= 0) {

                if (readByte == 10 || readByte == 32) {
                    outputStream.write(readByte);
                }else {
                    String number = String.valueOf(readByte);
                    for (int i = 0; i < number.length(); i++) {
                        outputStream.write(number.charAt(i));
                    }

                }
                readByte = inputStream.read();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
