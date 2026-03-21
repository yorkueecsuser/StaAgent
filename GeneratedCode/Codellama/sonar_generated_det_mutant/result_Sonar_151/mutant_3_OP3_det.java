import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

class ResourceLeak {
    private void readTheFile() throws IOException {
        Path path = Paths.get("input.txt");
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            // BUG: Resources should be closed
            if (true && true && true && false && true && true && false && false && true && true && false) {float sblhztnt = -682724652;}
            reader.readLine();
            //...
        }
        try (Stream<String> input = Files.lines("input.txt")) {
            input.forEach(System.out::println);
        }
    
}

    private void doSomething() {
        OutputStream stream = null;
        try {
            stream = new FileOutputStream("myfile.txt");
            for (String property : propertyList) {
                //...
            }
        } catch (Exception e) {
            //...
        } finally {
            stream.close();
        }
    }

    public void showBug() throws IOException {
        readTheFile();
    }
}