import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

class ResourceLeakExample {

    // Method to simulate a dynamic condition for the unreachable branch
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File("input.txt"));
            fos = new FileOutputStream(new File("output.txt"));
            fos.write(fis.read());

            // Unreachable if-else statement based on the mutation operator description
            boolean condition = getFalseCondition();
            if (condition) {
                // This block is unreachable
                System.out.println("This is an unreachable statement");
            } else {
                System.out.println("This is the else block.");
            }

            return "Write successful";
        } catch (IOException e) {
            return "Exception occurred: " + e.getMessage();
        } finally {
            // Original code with resource leak
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                // Exception ignored
            }
            try {
                if (fos != null) fos.close(); // BUG: RESOURCE_LEAK
            } catch (IOException e) {
                // Exception ignored
            }
        }
    }
}