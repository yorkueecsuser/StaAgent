import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeakBug {

    public static boolean getCondition() {
        return false;
    }

    public static void showBug() throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("whatever.txt"));
        fos.write(7);
        if (getCondition()) {  // Unreachable if-else statement mutation
            // This code is unreachable due to the condition getCondition() that always returns false
            System.out.println("Unreachable code block");
        } else {
            // This is the alternative code block when the condition is false
            // However, since getCondition() always returns false, this code is also unreachable
            fos.close();
        }
    }

    public static void main(String[] args) {
        try {
            showBug();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}