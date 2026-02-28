import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class InstanceofInCatchClause {

    public String showBug(String filePath) {
        StringBuilder result = new StringBuilder();
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            int content;
            while ((content = fileInputStream.read())!= -1) {
                result.append((char) content);
            }
            fileInputStream.close();
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                result.append("File not found.");
                result.append("File not found."); // Mutant: Duplicate assignment
            } else if (e instanceof IOException) {
                result.append("IO Exception occurred.");
                result.append("IO Exception occurred."); // Mutant: Duplicate assignment
            }
            // BUG: AvoidInstanceofChecksInCatchClause
        }
        return result.toString();
    }

    public static void main(String[] args) {
        InstanceofInCatchClause example = new InstanceofInCatchClause();
        System.out.println(example.showBug("nonexistentfile.txt"));
    }
}