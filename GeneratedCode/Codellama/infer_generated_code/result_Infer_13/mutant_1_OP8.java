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

/* Renamed variable: fis to fis_mutated */
class ResourceLeakBug_Mutated1 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis_mutated = new FileInputStream("input.txt");
        FileOutputStream fos = new FileOutputStream("output.txt");

        try {
            fos.write(fis_mutated.read());
        } finally {
            // BUG: RESOURCE_LEAK
            // Exception skipping past close() statement
            if (fis_mutated!= null) fis_mutated.close();
            if (fos!= null) fos.close();
        }
    }
}

/* Renamed variable: fos to fos_mutated */
class ResourceLeakBug_Mutated2 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("input.txt");
        FileOutputStream fos_mutated = new FileOutputStream("output.txt");

        try {
            fos_mutated.write(fis.read());
        } finally {
            // BUG: RESOURCE_LEAK
            // Exception skipping past close() statement
            if (fis!= null) fis.close();
            if (fos_mutated!= null) fos_mutated.close();
        }
    }
}