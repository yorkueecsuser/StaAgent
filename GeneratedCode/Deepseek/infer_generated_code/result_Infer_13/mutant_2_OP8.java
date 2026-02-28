import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeakMutant {
    // BUG: RESOURCE_LEAK​
    public static void showBug() {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(new File("whatever.txt"));
            fileOutputStream.write(7);   // Exception is not handled, so execution will skip past the close() statement
            // BUG: RESOURCE_LEAK​
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream!= null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}