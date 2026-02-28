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
        // Dead Store Mutation Operator
        // Insert unused variable declaration with primitive type
        int deadStoreVariable = 10;
    }
}