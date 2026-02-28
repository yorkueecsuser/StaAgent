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

// Mutant 1: Renamed variable "fis" to "fis1"
class ResourceLeakBug1 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis1 = new FileInputStream("input.txt");
        FileOutputStream fos = new FileOutputStream("output.txt");

        try {
            fos.write(fis1.read());
        } finally {
            // BUG: RESOURCE_LEAK
            // Exception skipping past close() statement
            if (fis1!= null) fis1.close();
            if (fos!= null) fos.close();
        }
    }
}

// Mutant 2: Renamed variable "fos" to "fos1"
class ResourceLeakBug2 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("input.txt");
        FileOutputStream fos1 = new FileOutputStream("output.txt");

        try {
            fos1.write(fis.read());
        } finally {
            // BUG: RESOURCE_LEAK
            // Exception skipping past close() statement
            if (fis!= null) fis.close();
            if (fos1!= null) fos1.close();
        }
    }
}