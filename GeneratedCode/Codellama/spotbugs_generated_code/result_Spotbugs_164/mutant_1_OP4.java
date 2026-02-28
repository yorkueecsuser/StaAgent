import java.io.File;
import java.io.IOException;
import java.util.Arrays;

class GeneratedBuggyCode {
    public static void main(String[] args) {
        String path = args[0];
        File file = new File(path);
        if (file.isFile()) {
            System.out.println("File found: " + file.getName());
        } else {
            System.out.println("File not found: " + file.getName());
        }

        // Unreachable if-else statement
        boolean isFile = false;
        if (isFile) {
            System.out.println("Unreachable: File found");
        } else {
            System.out.println("Unreachable: File not found");
        }
    }
}