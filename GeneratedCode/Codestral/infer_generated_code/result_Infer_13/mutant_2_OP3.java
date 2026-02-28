import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeakBug {

    public static boolean getFalseCondition() {
        return false;
    }

    public static void showBug() throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("whatever.txt"));
        fos.write(7);

        // Mutant code: Unreachable if statement
        if (getFalseCondition()) {
            // This code will never be executed
            System.out.println("Unreachable code");
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