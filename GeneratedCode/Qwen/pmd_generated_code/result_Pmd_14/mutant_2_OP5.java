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
            switch (condition? 0 : 1) {
                case 0:
                    // This case is unreachable because condition is never true
                    result.append("This is unreachable.");
                    break;
                case 1:
                    // This case is always executed
                    result.append("This is reachable.");
                    break;
            }
        }
        return result.toString();
    }

    private boolean getCondition() {
        // This method always returns false, making the switch condition always 1
        return false;
    }

    public static void main(String[] args) {
        InstanceofInCatchClause example = new InstanceofInCatchClause();
        System.out.println(example.showBug("nonexistentfile.txt"));
    }
}