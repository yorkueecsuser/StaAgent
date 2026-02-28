import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeakBug {

    public static void showBug() throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("whatever.txt"));
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // This loop is unreachable because the condition is always false
            // Adding code here will have no effect on the program's behavior
        }
        fos.write(7);
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