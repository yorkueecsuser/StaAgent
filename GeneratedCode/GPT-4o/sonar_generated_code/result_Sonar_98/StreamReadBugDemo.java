import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class StreamReadBugDemo {

    public String showBug(String fileName) {
        StringBuilder result = new StringBuilder();
        try {
            InputStream is = new FileInputStream(fileName);
            byte[] buffer = new byte[1000];
            is.read(buffer);  // BUG: The value returned from a stream read should be checked
            result.append(new String(buffer));
        } catch (IOException e) {
            result.append("Error reading file: ").append(e.getMessage());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        StreamReadBugDemo demo = new StreamReadBugDemo();
        System.out.println(demo.showBug("example.txt"));
    }
}