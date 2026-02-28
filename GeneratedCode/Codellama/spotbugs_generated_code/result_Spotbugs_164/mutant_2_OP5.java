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
    }
}

// Unreachable switch statement
switch(0) {
    case 1:
        System.out.println("This code is unreachable");
        break;
    default:
        System.out.println("This code is also unreachable");
        break;
}