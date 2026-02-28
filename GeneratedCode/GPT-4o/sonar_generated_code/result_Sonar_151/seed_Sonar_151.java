import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

class ResourceLeakExample {

    private String fileName = "example.txt";
    private List<String> propertyList = List.of("prop1", "prop2", "prop3");

    public void showBug() throws IOException {
        readTheFile();
        doSomething();
    }

    private void readTheFile() throws IOException {
        Path path = Paths.get(this.fileName);
        BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8); // BUG: Resources should be closed
        try {
            // Simulate reading the file
            reader.readLine();
        } finally {
            reader.close(); // Closing here, but if an exception occurs before this line, it won't be closed
        }

        // An example of an unclosed stream
        Stream<String> lines = Files.lines(Paths.get("input.txt")); // BUG: Resources should be closed
        try {
            lines.forEach(System.out::println);
        } finally {
            lines.close(); // Closing here, but same risk as BufferedReader
        }
    }

    private void doSomething() {
        OutputStream stream = null;
        try {
            for (String property : propertyList) {
                stream = new FileOutputStream("myfile.txt"); // BUG: Resources should be closed
                // Simulate writing to the file
                stream.write(property.getBytes());
            }
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            if (stream != null) {
                try {
                    stream.close(); // Only the last stream opened will be closed
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}