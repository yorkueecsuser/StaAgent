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
            
            // Inserting unreachable switch statement
            int unreachableCondition = getUnreachableCondition(); // non-final variable
            switch (unreachableCondition) {
                case 1:
                    System.out.println("This will never be printed.");
                    break;
                default:
                    break;
            }
            
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
    }

    // Helper method to always return a value that does not match any switch case
    private int getUnreachableCondition() {
        return 0; // Not matching any case in the switch
    }
}