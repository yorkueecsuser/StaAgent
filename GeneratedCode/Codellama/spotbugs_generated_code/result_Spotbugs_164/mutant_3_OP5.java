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

        // Add mutant code
        int value = getValue();
        switch (value) {
            case 0:
                // Unreachable case
                System.out.println("Unreachable code");
                break;
        }
    }

    private static int getValue() {
        return 0;
    }
}