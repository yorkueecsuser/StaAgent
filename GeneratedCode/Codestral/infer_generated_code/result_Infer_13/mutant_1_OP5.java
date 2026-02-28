import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeakBug {

    public static void showBug() throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("whatever.txt"));
        fos.write(7);

        // Unreachable switch statement
        boolean shouldNotExecute = false;
        int value = getValue();
        if (shouldNotExecute) {
            switch (value) {
                case 1:
                    // This code will never be executed
                    break;
                // Add more cases if necessary
            }
        }

        fos.close();
    }

    // Method to return a value for the switch statement
    private static int getValue() {
        return 0;
    }

    public static void main(String[] args) {
        try {
            showBug();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}