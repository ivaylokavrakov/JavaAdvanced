import java.io.File;

public class p007ListFiles {
    public static void main(String[] args) {
        String filePath ="C:\\Users\\Monika\\Desktop\\Java Advanced\\resources\\Files-and-Streams";

        File file = new File(filePath);
       File[] nestedFiles = file.listFiles();

       for (File nestedFile : nestedFiles){
           if (nestedFile.isFile()){
               System.out.printf("%s: [%d]%n",nestedFile.getName(),nestedFile.length());

           }        }

    }
}
