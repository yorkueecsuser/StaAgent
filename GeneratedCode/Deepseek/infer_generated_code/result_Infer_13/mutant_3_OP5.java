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

            // Mutation Operator Unreachable switch statement
            switch("unreachable") {
                case "unreachable":
                    System.out.println("This code will never be executed");
                    break;
                default:
                    System.out.println("Also this code will never be executed");
                    break;
            }

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
    }

    public static void main(String[] args) {
        showBug();
    }
}