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
            int value = 0; // Added non-final variable for runtime control
            switch (value) { // Added unreachable switch statement
                case 0:
                    System.out.println("Unreachable switch statement");
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
            int value = 0; // Added non-final variable for runtime control
            switch (value) { // Added unreachable switch statement
                case 0:
                    System.out.println("Unreachable switch statement");
                    break;
            }
        } finally {
            if (fos!= null) {
                try {
                    fos.close();
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