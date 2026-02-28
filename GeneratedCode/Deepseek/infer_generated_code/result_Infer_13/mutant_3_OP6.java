import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeak {
    // BUG: RESOURCE_LEAK
    public static void showBug() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("whatever.txt"));
            fos.write(7);
            // BUG: RESOURCE_LEAK
            boolean shouldRun = getCondition();
            for (int i = 0; i < 100; i++) {
                if (!shouldRun) {
                    System.out.println("unreachable code");
                }
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

    public static void main(String[] args) {
        showBug();
    }

    // helper method to get a non-compile-time constant for the condition
    private static boolean getCondition() {
        return Math.random() < 0.5;
    }
}