import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeakBug {

    public static void showBug() throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("whatever.txt"));
        FileOutputStream fosRenamed = fos; // Mutant code: Renaming fos to fosRenamed
        fosRenamed.write(7);   // DOH! What if exception?
        fosRenamed.close(); // Mutant code: Using fosRenamed instead of fos
    }

    public static void main(String[] args) {
        try {
            showBug();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}