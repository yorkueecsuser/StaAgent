import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeakBug {

    // New method to return a false condition
    private static boolean getCondition() {
        return false;
    }

    public static void showBug() throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("whatever.txt"));
        fos.write(7);   // DOH! What if exception?

        // Unreachable for loop
        for (int i = 0; getCondition(); i++) {
            System.out.println("This line will never be executed");
        }

        fos.close();
    }

    public static void main(String[] args) {
        try {
            showBug();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}