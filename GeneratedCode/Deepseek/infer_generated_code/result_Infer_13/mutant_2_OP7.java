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
            boolean conditionFor = getCondition(); 
            // Added mutation operator Unreachable while loop
            while (conditionFor) {
                System.out.println("This is an unreachable loop");
            }
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

    // Added method for non-final variable
    private static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        showBug();
    }
}