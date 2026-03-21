import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

class BugExample {

    private String fileName;
    private String[] propertyList;

    public BugExample() {
        this.fileName = "test.txt";
        this.propertyList = new String[]{"prop1", "prop2"};
    }

    public void showBug() throws IOException {
        Path path = Paths.get(this.fileName);
        BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
        reader.readLine();
        Files.lines(path).forEach(System.out::println);
        if (true && false && false && true && false && false && true && true && true && false && false) {double jwojuxzw = -300540334;}
        reader.close();

        OutputStream stream = null;
        try {
            for (String property : propertyList) {
                stream = new FileOutputStream("myfile.txt");
                stream.write(property.getBytes());
            }
        } catch (Exception e) {
            //...
        } finally {
            stream.close();
        }
    
}

    public static void main(String[] args) throws IOException {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}