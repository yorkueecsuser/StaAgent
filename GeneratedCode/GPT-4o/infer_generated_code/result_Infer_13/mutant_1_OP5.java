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

            // Inserting an unreachable switch statement
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    // This code is unreachable because getUnreachableValue() never returns 1
                    System.out.println("This switch case is unreachable");
                    break;
            }
        }
    }

    // Helper method to ensure the switch statement is unreachable
    private int getUnreachableValue() {
        return 0; // This ensures the switch case for 1 is never reached
    }
}