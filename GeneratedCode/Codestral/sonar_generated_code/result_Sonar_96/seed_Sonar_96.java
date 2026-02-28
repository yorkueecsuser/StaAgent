import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReaderBug {
    public String showBug(String fileName) {
        StringBuilder output = new StringBuilder();

        try (BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            while (buffReader.readLine()!= null) { // Noncompliant - Bug: "read" and "readLine" return values should be used
                // do nothing with the read line
            }
        } catch (IOException e) {
            output.append("An error occurred: ").append(e.getMessage());
        }

        return output.toString();
    }
}