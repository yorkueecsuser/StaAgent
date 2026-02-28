import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeakBug {

    public static void showBug() throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("whatever.txt"));
        fos.write(7);

        // Mutant: Unreachable switch statement
        boolean condition = false; // this condition will always evaluate to false
        int value = 1; // this value does not matter since the switch will never be reached
        if (condition) {
            switch (value) {
                case 1:
                    // This code will never be reached
                    System.out.println("Unreachable code");
                    break;
                default:
                    // Default case will also never be reached
                    break;
            }
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