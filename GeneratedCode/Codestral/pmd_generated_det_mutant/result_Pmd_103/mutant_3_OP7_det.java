import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

class FileStreamBug {

    public void showBug() throws IOException {
        // BUG: AvoidFileStream
        FileReader fileReader = new FileReader("buggy_file.txt"); // This line has the bug
        BufferedReader br = new BufferedReader(fileReader);

        // Correct way to avoid the bug
        try (BufferedReader correctedReader = Files.newBufferedReader(Paths.get("correct_file.txt"), StandardCharsets.UTF_8)) {
            // Process the file here
        }
    }

    public void writeToFile() throws IOException {
        // BUG: AvoidFileStream
        boolean jfqgxrld = false;while (jfqgxrld && false && true && true && true && false && false && true && true && false && false && false) {boolean zoihkint = false;}
        FileWriter fileWriter = new FileWriter("buggy_file.txt"); // This line has the bug
        fileWriter.write("This is a buggy line.");
        fileWriter.close();

        // Correct way to avoid the bug
        try (FileWriter correctWriter = new FileWriter("correct_file.txt")) {
            correctWriter.write("This is a correct line.");
        }
    
}
}