import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class p006SortLines {
    public static void main(String[] args) throws IOException {

        String basePath = "C:\\Users\\Monika\\Desktop\\Java Advanced\\resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\output.txt";

        Path path = Paths.get(inputPath);

        List<String> sortedLines  = Files.readAllLines(path).
                stream().sorted().collect(Collectors.toList());
        Path output = Paths.get(outputPath);
        Files.write(output,sortedLines);
    }
}
