import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadLineBugExample {
    public void doSomethingWithFile(String fileName) {
        try (BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            do { // BUG: "read" and "readLine" return values should be used
                //...
            } while (buffReader.readLine()!= null);
        } catch (IOException e) {
            //...
        }
    }

    public static void showBug(String fileName) throws IOException {
        ReadLineBugExample example = new ReadLineBugExample();
        example.doSomethingWithFile(fileName);
    }
}