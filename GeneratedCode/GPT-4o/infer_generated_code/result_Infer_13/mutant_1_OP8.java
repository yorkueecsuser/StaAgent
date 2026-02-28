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
    }

    // Mutated code with renamed variable
    public String showBugMutant() {
        FileInputStream a = null; // renamed fis to a
        FileOutputStream fos = null;
        try {
            a = new FileInputStream(new File("input.txt")); // renamed fis to a
            fos = new FileOutputStream(new File("output.txt"));
            fos.write(a.read()); // renamed fis to a
            return "Write successful";
        } catch (IOException e) {
            return "Exception occurred: " + e.getMessage();
        } finally {
            // Here lies the bug
            try {
                if (a != null) a.close(); // renamed fis to a
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