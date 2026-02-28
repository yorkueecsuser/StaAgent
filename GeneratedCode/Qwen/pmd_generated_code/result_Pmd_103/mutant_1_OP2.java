import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileStreamExample {

    public String showBug1(String fileName) throws IOException {
        // This line demonstrates the use of FileInputStream which can cause garbage collection pauses
        FileInputStream fis = new FileInputStream(fileName); // BUG: AvoidFileStream
        FileInputStream fis_duplicate = new FileInputStream(fileName); // Mutant: Duplicate assignment
        StringBuilder content = new StringBuilder();
        int i;
        while ((i = fis.read())!= -1) {
            content.append((char) i);
        }
        fis.close();
        fis_duplicate.close(); // Ensure resource is closed
        return content.toString();
    }

    public void showBug2(String fileName, String content) throws IOException {
        // This line demonstrates the use of FileOutputStream which can cause garbage collection pauses
        FileOutputStream fos = new FileOutputStream(fileName); // BUG: AvoidFileStream
        FileOutputStream fos_duplicate = new FileOutputStream(fileName); // Mutant: Duplicate assignment
        fos.write(content.getBytes());
        fos_duplicate.write(content.getBytes()); // Ensure both streams write the same content
        fos.close();
        fos_duplicate.close(); // Ensure resource is closed
    }

    public String showBug3(String fileName) throws IOException {
        // This line demonstrates the use of FileReader which can cause garbage collection pauses
        FileReader fr = new FileReader(fileName); // BUG: AvoidFileStream
        FileReader fr_duplicate = new FileReader(fileName); // Mutant: Duplicate assignment
        StringBuilder content = new StringBuilder();
        int i;
        while ((i = fr.read())!= -1) {
            content.append((char) i);
        }
        fr.close();
        fr_duplicate.close(); // Ensure resource is closed
        return content.toString();
    }

    public void showBug4(String fileName, String content) throws IOException {
        // This line demonstrates the use of FileWriter which can cause garbage collection pauses
        FileWriter fw = new FileWriter(fileName); // BUG: AvoidFileStream
        FileWriter fw_duplicate = new FileWriter(fileName); // Mutant: Duplicate assignment
        fw.write(content);
        fw_duplicate.write(content); // Ensure both writers write the same content
        fw.close();
        fw_duplicate.close(); // Ensure resource is closed
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