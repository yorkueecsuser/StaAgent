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
            } else if (e instanceof IOException) {
                result.append("IO Exception occurred.");
            }
            // BUG: AvoidInstanceofChecksInCatchClause

            // Introduced Unreachable Switch Statement
            boolean condition = getCondition();
            switch (condition) {
                case true:
                    result.append("This is unreachable.");
                    break;
            }
        }
        return result.toString();
    }

    private boolean getCondition() {
        return false; // This method ensures the switch statement remains unreachable
    }

    public static void main(String[] args) {
        InstanceofInCatchClause example = new InstanceofInCatchClause();
        System.out.println(example.showBug("nonexistentfile.txt"));
    }
}