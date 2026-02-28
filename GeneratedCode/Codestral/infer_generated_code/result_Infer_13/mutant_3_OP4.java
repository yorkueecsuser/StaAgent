import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeakBug {

    public static boolean getCondition() {
        // This method is just for demonstration,
        // you can replace it with your own implementation
        return false;
    }

    public static void showBug() throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("whatever.txt"));
        fos.write(7);   // DOH! What if exception?

        // Unreachable if-else statement mutant
        // The condition of the inserted branch is always false to make it unreachable.
        if (getCondition()) {
            // This block is unreachable
            int a = 10;
            System.out.println("Unreachable block");
        } else {
            // This block is also unreachable
            int b = 20;
            System.out.println("Another unreachable block");
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