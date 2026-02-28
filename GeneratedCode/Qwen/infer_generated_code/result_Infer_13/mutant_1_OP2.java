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
        FileInputStream fis2 = new FileInputStream(new File("input.txt"));  // DUPLICATION
        FileOutputStream fos = new FileOutputStream(new File("output.txt"));
        FileOutputStream fos2 = new FileOutputStream(new File("output.txt"));  // DUPLICATION
        int data;
        while ((data = fis.read())!= -1) {
            fos.write(data);  // BUG: RESOURCE_LEAK
        }
        fos.close();
        fis.close();
        fos2.close();  // DUPLICATION
        fis2.close();  // DUPLICATION
    }

    /**
     * Demonstrates a resource leak due to an exception in the close() method of one resource.
     */
    public void showBug2() throws IOException {
        FileInputStream fis = null;
        FileInputStream fis2 = null;  // DUPLICATION
        FileOutputStream fos = null;
        FileOutputStream fos2 = null;  // DUPLICATION
        try {
            fis = new FileInputStream(new File("input.txt"));
            fis2 = new FileInputStream(new File("input.txt"));  // DUPLICATION
            fos = new FileOutputStream(new File("output.txt"));
            fos2 = new FileOutputStream(new File("output.txt"));  // DUPLICATION
            int data;
            while ((data = fis.read())!= -1) {
                fos.write(data);
            }
        } finally {
            if (fis!= null) fis.close();  // BUG: RESOURCE_LEAK
            if (fis2!= null) fis2.close();  // DUPLICATION
            if (fos!= null) fos.close();
            if (fos2!= null) fos2.close();  // DUPLICATION
        }
    }
}