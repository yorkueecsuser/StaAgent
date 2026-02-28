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
        fos.close();
        fis.close();

        // Mutant code
        FileInputStream a = new FileInputStream(new File("input.txt"));
        FileOutputStream b = new FileOutputStream(new File("output.txt"));
        int c;
        while ((c = a.read())!= -1) {
            b.write(c);  // BUG: RESOURCE_LEAK
        }
        b.close();
        a.close();
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
        }

        // Mutant code
        FileInputStream x = null;
        FileOutputStream y = null;
        try {
            x = new FileInputStream(new File("input.txt"));
            y = new FileOutputStream(new File("output.txt"));
            int z;
            while ((z = x.read())!= -1) {
                y.write(z);
            }
        } finally {
            if (x!= null) x.close();  // BUG: RESOURCE_LEAK
            if (y!= null) y.close();
        }
    }
}