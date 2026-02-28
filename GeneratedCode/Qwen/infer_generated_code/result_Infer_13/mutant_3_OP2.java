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
        FileInputStream fis_duplicate = new FileInputStream(new File("input.txt")); // DUPLICATION
        FileOutputStream fos = new FileOutputStream(new File("output.txt"));
        FileOutputStream fos_duplicate = new FileOutputStream(new File("output.txt")); // DUPLICATION
        int data;
        while ((data = fis.read())!= -1) {
            fos.write(data);  // BUG: RESOURCE_LEAK
        }
        fos.close();
        fis.close();
        fos_duplicate.close(); // DUPLICATION
        fis_duplicate.close(); // DUPLICATION
    }

    /**
     * Demonstrates a resource leak due to an exception in the close() method of one resource.
     */
    public void showBug2() throws IOException {
        FileInputStream fis = null;
        FileInputStream fis_duplicate = null; // DUPLICATION
        FileOutputStream fos = null;
        FileOutputStream fos_duplicate = null; // DUPLICATION
        try {
            fis = new FileInputStream(new File("input.txt"));
            fis_duplicate = new FileInputStream(new File("input.txt")); // DUPLICATION
            fos = new FileOutputStream(new File("output.txt"));
            fos_duplicate = new FileOutputStream(new File("output.txt")); // DUPLICATION
            int data;
            while ((data = fis.read())!= -1) {
                fos.write(data);
            }
        } finally {
            if (fis!= null) fis.close();  // BUG: RESOURCE_LEAK
            if (fis_duplicate!= null) fis_duplicate.close(); // DUPLICATION
            if (fos!= null) fos.close();
            if (fos_duplicate!= null) fos_duplicate.close(); // DUPLICATION
        }
    }
}