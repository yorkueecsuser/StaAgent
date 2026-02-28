import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeak {
    // BUG: RESOURCE_LEAK​
    public static void showBug() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("whatever.txt"));
            fos.write(7);   // Exception is not handled, so execution will skip past the close() statement
            // BUG: RESOURCE_LEAK​
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos!= null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        boolean condition = false;
        if (condition) {
            // This is a mutant code that adds an unreachable if statement
            System.out.println("This is unreachable code.");
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}