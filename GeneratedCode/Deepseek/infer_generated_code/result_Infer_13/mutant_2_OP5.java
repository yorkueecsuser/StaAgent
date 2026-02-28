import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeak {
    // BUG: RESOURCE_LEAK
    public static void showBug() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("whatever.txt"));
            fos.write(7);   // Exception is not handled, so execution will skip past the close() statement
            // BUG: RESOURCE_LEAK
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Add a unreachable switch statement
            int unreachableValue = 0;
            switch (unreachableValue) {
                case 1:
                    // This code will never be executed, making the switch statement unreachable
                    System.out.println("This code is unreachable");
                    break;
                default:
                    break;
            }
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