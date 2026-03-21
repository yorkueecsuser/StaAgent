import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadReturnValueBug {

    public String showBug(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            do { // BUG: "read" and "readLine" return values should be used
                //...
            } while (buffReader.readLine()!= null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    public static void main(String[] args) {
        ReadReturnValueBug bugDemo = new ReadReturnValueBug();
        bugDemo.showBug("example.txt");
    }
}