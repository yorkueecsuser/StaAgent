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

        // Inserted unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is reachable code.");
        } else {
            System.out.println("This is unreachable code.");
        }

        return content.toString();
    }

    public void showBug2(String fileName, String content) throws IOException {
        // This line demonstrates the use of FileOutputStream which can cause garbage collection pauses
        FileOutputStream fos = new FileOutputStream(fileName); // BUG: AvoidFileStream
        fos.write(content.getBytes());
        fos.close();

        // Inserted unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is reachable code.");
        } else {
            System.out.println("This is unreachable code.");
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

        // Inserted unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is reachable code.");
        } else {
            System.out.println("This is unreachable code.");
        }

        return content.toString();
    }

    public void showBug4(String fileName, String content) throws IOException {
        // This line demonstrates the use of FileWriter which can cause garbage collection pauses
        FileWriter fw = new FileWriter(fileName); // BUG: AvoidFileStream
        fw.write(content);
        fw.close();

        // Inserted unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is reachable code.");
        } else {
            System.out.println("This is unreachable code.");
        }
    }

    private boolean getCondition() {
        return true; // This will ensure the if block is always executed, making the else block unreachable
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