import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.List;

class ResourceLeakExample {

    private String fileName;
    private List<String> propertyList;

    public ResourceLeakExample(String fileName, List<String> propertyList) {
        this.fileName = fileName;
        this.propertyList = propertyList;
    }

    public void showBug1() throws IOException {
        BufferedReader reader = Files.newBufferedReader(Paths.get(this.fileName), StandardCharsets.UTF_8);
        reader.readLine();  // BUG: Resources should be closed
        //...
        reader.close();  // This is not compliant as it can be skipped by an exception
    }

    public void showBug2() {
        OutputStream stream = null;
        try {
            for (String property : propertyList) {
                stream = new FileOutputStream("myfile.txt");  // BUG: Resources should be closed
                //...
            }
        } catch (Exception e) {
            //...
        } finally {
            if (stream!= null) {
                try {
                    stream.close();  // Only the last stream is closed, others are leaked
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void showBug3() throws IOException {
        Files.lines(Paths.get("input.txt")).forEach(System.out::println);  // BUG: Resources should be closed
    }

    public void showBug(String fileName, List<String> propertyList) throws IOException {
        this.fileName = fileName;
        this.propertyList = propertyList;
        showBug1();
        showBug2();
        showBug3();
    }
}