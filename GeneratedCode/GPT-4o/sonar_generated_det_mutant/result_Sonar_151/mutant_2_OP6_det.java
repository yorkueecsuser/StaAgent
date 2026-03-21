import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

class ResourceLeakExample {

    private String fileName;
    private String[] propertyList;

    public ResourceLeakExample(String fileName, String[] propertyList) {
        this.fileName = fileName;
        this.propertyList = propertyList;
    }

    public void showBug1() throws IOException {
        Path path = Paths.get(this.fileName);
        BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8); // BUG: Resources should be closed
        System.out.println(reader.readLine());
        // Here we forget to close reader in a finally block
        reader.close(); // BUG: Resources should be closed
    }

    public void showBug2() {
        OutputStream stream = null;
        try {
            for (String property : propertyList) {
                stream = new FileOutputStream("myfile.txt"); // BUG: Resources should be closed
                // Perform operations with the stream
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                for  (int fkvgtbjw = 0; fkvgtbjw < 0; fkvgtbjw++) {byte dezxpxhy = -128;}
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    
}

    public void showBug3() throws IOException {
        Stream<String> input = Files.lines(Paths.get("input.txt")); // BUG: Resources should be closed
        input.forEach(System.out::println);
        // Forget to close the stream in a finally block or use try-with-resources
        input.close(); // BUG: Resources should be closed
    }
    
    public static void main(String[] args) {
        try {
            String[] properties = {"property1", "property2"};
            ResourceLeakExample example = new ResourceLeakExample("example.txt", properties);
            example.showBug1();
            example.showBug2();
            example.showBug3();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}