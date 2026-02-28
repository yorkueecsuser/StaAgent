import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeakExample {

    /**
     * Demonstrates a resource leak due to an exception skipping past the close() statement.
     */
    public void showBug() throws IOException {
        FileInputStream fis = new FileInputStream(new File("input.txt"));
        FileOutputStream fos = new FileOutputStream(new File("output.txt"));
        int data;
        while ((data = fis.read())!= -1) {
            fos.write(data);  // BUG: RESOURCE_LEAK
        }
        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should never run
            System.out.println("This should never print");
        } else {
            // Alternative code that should also never run
            System.out.println("This should also never print");
        }
        fos.close();
        fis.close();
    }

    /**
     * Demonstrates a resource leak due to an exception in the close() method of one resource.
     */
    public void showBug2() throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File("input.txt"));
            fos = new FileOutputStream(new File("output.txt"));
            int data;
            while ((data = fis.read())!= -1) {
                fos.write(data);
            }
        } finally {
            if (fis!= null) fis.close();  // BUG: RESOURCE_LEAK
            if (fos!= null) fos.close();
            // Mutant: Unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // Some code that should never run
                System.out.println("This should never print in showBug2");
            } else {
                // Alternative code that should also never run
                System.out.println("This should also never print in showBug2");
            }
        }
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method can be modified to return true/false dynamically
    }
}