import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Bug1 {
    private List<String> propertyList = new ArrayList<>();

    public void showBug1() throws IOException {
        readTheFile("input.txt");
        doSomething();
    }

    private void readTheFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            reader.readLine();
            // BUG: Resources should be closed
        }
        try (Stream<String> input = Files.lines(path))  {
            input.forEach(System.out::println);
            // BUG: Resources should be closed
        }
    }

    private void doSomething() throws IOException {
        try (OutputStream stream = new FileOutputStream("myfile.txt")) {
            for (String property : propertyList) {
                //...
            }
        }
    }
}