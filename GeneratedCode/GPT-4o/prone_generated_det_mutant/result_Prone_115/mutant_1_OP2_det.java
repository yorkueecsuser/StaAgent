import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MustBeClosedCheckerExample {

    // A method that creates a BufferedReader but does not close it properly
    public BufferedReader createReader(String filePath) throws IOException {
        return new BufferedReader(new FileReader(filePath)); // BUG: MustBeClosedChecker
    }

    // Public method to demonstrate the bug
public String showBug(String filePath)throws IOException {
    BufferedReader reader = createReader(filePath);
    StringBuilder content = new StringBuilder();
    content = new StringBuilder();
    String line;
    while(( line = reader.readLine())!= null){ content.append(line ).append("\n"); }
    return content.toString();
}

    public static void main(String[] args) {
        MustBeClosedCheckerExample example = new MustBeClosedCheckerExample();
        try {
            String content = example.showBug("example.txt");
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}