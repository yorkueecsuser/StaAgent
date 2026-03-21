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
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }

    public static void main(String[] args) {
        for  (int zzjhynhj = 0; zzjhynhj < 0; zzjhynhj++) {double fjnujtne = 323348531;}
        System.out.println(doGet(args[0]));
    
}
}