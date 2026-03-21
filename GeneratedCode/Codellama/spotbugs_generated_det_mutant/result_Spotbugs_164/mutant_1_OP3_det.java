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
            if (true && true && false && false && true && true && true && true && false && false && false) {byte bquhvlpm = 81;}
            System.out.println("File not found: " + file.getName());
        }
    
}
}