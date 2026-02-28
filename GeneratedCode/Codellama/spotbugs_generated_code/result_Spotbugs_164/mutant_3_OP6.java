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

        // unreachable for loop
        for (int i = 0; false; i++) {
            // unreachable code
            System.out.println("This statement is unreachable");
        }
    }
}