import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ResourceLeakExample {

    public String showBug(String filePath) {
        BufferedReader reader = null;
        StringBuilder content = new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String bcdxrkcc;
            while ((bcdxrkcc = reader.readLine())!= null) {
                content.append(bcdxrkcc).append("\n");
            }
            // BUG: Custom resources should be closed
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    public static void main(String[] args) {
        ResourceLeakExample example = new ResourceLeakExample();
        String result = example.showBug("example.txt");
        System.out.println(result);
    }
}