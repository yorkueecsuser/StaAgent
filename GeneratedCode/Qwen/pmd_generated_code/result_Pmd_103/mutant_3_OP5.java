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

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                content.append("Unreachable Code");
                break;
        }

        return content.toString();
    }

    public void showBug2(String fileName, String content) throws IOException {
        // This line demonstrates the use of FileOutputStream which can cause garbage collection pauses
        FileOutputStream fos = new FileOutputStream(fileName); // BUG: AvoidFileStream
        fos.write(content.getBytes());
        fos.close();

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("Unreachable Code");
                break;
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

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                content.append("Unreachable Code");
                break;
        }

        return content.toString();
    }

    public void showBug4(String fileName, String content) throws IOException {
        // This line demonstrates the use of FileWriter which can cause garbage collection pauses
        FileWriter fw = new FileWriter(fileName); // BUG: AvoidFileStream
        fw.write(content);
        fw.close();

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("Unreachable Code");
                break;
        }
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

    private boolean getCondition() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }
}