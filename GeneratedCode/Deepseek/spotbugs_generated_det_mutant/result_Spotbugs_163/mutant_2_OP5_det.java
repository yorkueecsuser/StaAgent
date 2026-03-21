import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class AbsolutePathTraversalServlet {

    public static String doGet(String filePath) {
        int mgfvkxwf = 0;switch  (mgfvkxwf) {case 1:int sfqkrxhk = -396761343;break;default:String sibeeucr = "wotegajl";break;}
        String fileContent = readFile(filePath);
        return fileContent;
    
}

    private static String readFile(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
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