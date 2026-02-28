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
        
        // mutant 1
        String path2 = args[1];
        File file2 = new File(path2);
        if (file2.isFile()) {
            System.out.println("File found: " + file2.getName());
        } else {
            System.out.println("File not found: " + file2.getName());
        }
    }
}