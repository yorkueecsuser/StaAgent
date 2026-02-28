import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeakBug {

    private static boolean getUnreachableCondition() {
        return false; // Always returns false, making the loop unreachable
    }

    public static void showBug() throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("whatever.txt"));
        fos.write(7);

        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // Unreachable code
            System.out.println("This code will never be executed.");
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