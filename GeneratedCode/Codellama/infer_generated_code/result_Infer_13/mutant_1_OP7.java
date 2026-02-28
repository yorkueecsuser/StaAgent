import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeakBug {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("input.txt");
        FileOutputStream fos = new FileOutputStream("output.txt");

        try {
            fos.write(fis.read());
        } finally {
            // BUG: RESOURCE_LEAK
            // Exception skipping past close() statement
            if (fis!= null) fis.close();
            if (fos!= null) fos.close();
        }
    }
}

// Mutant code
public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("input.txt");
    FileOutputStream fos = new FileOutputStream("output.txt");

    try {
        fos.write(fis.read());
    } finally {
        // Unreachable while loop
        boolean condition = false;
        while (condition) {
            // Code that will never be executed
            System.out.println("This is an unreachable while loop");
        }

        // BUG: RESOURCE_LEAK
        // Exception skipping past close() statement
        if (fis!= null) fis.close();
        if (fos!= null) fos.close();
    }
}