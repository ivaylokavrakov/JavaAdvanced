import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class p001ReadFIle {
    public static void main(String[] args) throws IOException {
        //четем файл

        String filePath = "C:\\Users\\Monika\\Desktop\\Java Advanced\\resources\\input.txt";
        try (InputStream inputStream = new FileInputStream(filePath)){
            int readByte = inputStream.read();
           while (readByte>=0){
               System.out.print(Integer.toBinaryString(readByte)+ " ");

               readByte = inputStream.read();
           }
        }catch ( IOException e){
            throw  new RuntimeException(e);
        }

//        InputStream inputStream = new FileInputStream(filePath);
//       int firstByte = inputStream.read();
//        System.out.println(firstByte);
//        System.out.println((char) firstByte);
//
//        inputStream.close();
    }
}
