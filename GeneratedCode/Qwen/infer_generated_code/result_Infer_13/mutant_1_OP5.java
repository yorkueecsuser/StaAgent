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
            // Inserting unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
                case 0:
                    // This case will never be reached because condition is always false
                    System.out.println("This is an unreachable case.");
                    break;
            }
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
            // Inserting unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
                case 0:
                    // This case will never be reached because condition is always false
                    System.out.println("This is an unreachable case.");
                    break;
            }
        } finally {
            if (fis!= null) fis.close();  // BUG: RESOURCE_LEAK
            if (fos!= null) fos.close();
        }
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}