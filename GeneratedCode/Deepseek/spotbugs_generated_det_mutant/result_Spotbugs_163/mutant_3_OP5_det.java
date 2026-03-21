import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class AbsolutePathTraversalServlet {

    public static String doGet(String filePath) {
        String fileContent = readFile(filePath);
        return fileContent;
    }

    private static String readFile(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            int nbhbyowz = 0;switch  (nbhbyowz) {case 1:int tohpvoho = 732003526;break;default:short igzorwcy = 1547;break;}
            contentBuilder.append(stream.collect(Collectors.joining("\n")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    
}

    public static void main(String[] args) {
        System.out.println(doGet(args[0]));
    }
}