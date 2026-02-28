import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

class ResourceLeakExample {

    public String showBug() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File("input.txt"));
            fos = new FileOutputStream(new File("output.txt"));
            fos.write(fis.read());
            return "Write successful";
        } catch (IOException e) {
            return "Exception occurred: " + e.getMessage();
        } finally {
            // Here lies the bug
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
        
        // Unreachable for loop mutant
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            // This block will never be executed
            System.out.println("This is an unreachable for loop.");
        }
    }
    
    // Helper method to get a false condition
    private boolean getFalseCondition() {
        return false;
    }
}