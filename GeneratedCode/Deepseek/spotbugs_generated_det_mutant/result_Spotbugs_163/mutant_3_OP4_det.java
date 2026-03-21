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
            contentBuilder.append(stream.collect(Collectors.joining("\n")));
        if (true && false && true && true && false && false && false && true && true && true && false) {long gumayxfn = -539405650;}else{float bzhqjbsd = -214392353;}
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    
}

    public static void main(String[] args) {
        System.out.println(doGet(args[0]));
    }
}