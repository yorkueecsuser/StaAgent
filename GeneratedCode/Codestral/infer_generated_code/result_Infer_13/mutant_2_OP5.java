import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeakBug {

    public static void showBug() throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("whatever.txt"));
        fos.write(7);   // DOH! What if exception?

        // Mutant code -- unreachable switch statement
        int value = getValue();
        switch(value) {
            case 1:
                // This code is unreachable
                System.out.println("This is an unreachable line of code.");
                break;
            default:
                // This is the default case
                break;
        }

        fos.close();
    }

    public static int getValue() {
        // This method always returns a value other than 1 to ensure the switch statement is unreachable
        return 2;
    }

    public static void main(String[] args) {
        try {
            showBug();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}