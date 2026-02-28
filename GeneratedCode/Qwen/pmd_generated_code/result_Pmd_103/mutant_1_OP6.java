import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileStreamExample {

    public String showBug1(String fileName) throws IOException {
        // This line demonstrates the use of FileInputStream which can cause garbage collection pauses
        FileInputStream fis = new FileInputStream(fileName); // BUG: AvoidFileStream
        StringBuilder content = new StringBuilder();
        int i;
        while ((i = fis.read())!= -1) {
            content.append((char) i);
        }
        fis.close();
        
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) {
            // This loop is unreachable
        }
        
        return content.toString();
    }

    public void showBug2(String fileName, String content) throws IOException {
        // This line demonstrates the use of FileOutputStream which can cause garbage collection pauses
        FileOutputStream fos = new FileOutputStream(fileName); // BUG: AvoidFileStream
        fos.write(content.getBytes());
        fos.close();
        
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) {
            // This loop is unreachable
        }
    }

    public String showBug3(String fileName) throws IOException {
        // This line demonstrates the use of FileReader which can cause garbage collection pauses
        FileReader fr = new FileReader(fileName); // BUG: AvoidFileStream
        StringBuilder content = new StringBuilder();
        int i;
        while ((i = fr.read())!= -1) {
            content.append((char) i);
        }
        fr.close();
        
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) {
            // This loop is unreachable
        }
        
        return content.toString();
    }

    public void showBug4(String fileName, String content) throws IOException {
        // This line demonstrates the use of FileWriter which can cause garbage collection pauses
        FileWriter fw = new FileWriter(fileName); // BUG: AvoidFileStream
        fw.write(content);
        fw.close();
        
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) {
            // This loop is unreachable
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        FileStreamExample example = new FileStreamExample();
        try {
            example.showBug1("example.txt");
            example.showBug2("example.txt", "Hello, World!");
            example.showBug3("example.txt");
            example.showBug4("example.txt", "Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}