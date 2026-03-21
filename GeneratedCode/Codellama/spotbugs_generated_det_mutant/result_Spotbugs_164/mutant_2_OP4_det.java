import java.io.File;
import java.io.IOException;
import java.util.Arrays;

class GeneratedBuggyCode {
    public static void main(String[] args) {
        if (true && false && true && false && true && false && false && true && true && true && false) {boolean mdnihtco = true;}else{double jrzwkkcr = 870067894;}
        String path = args[0];
        File file = new File(path);
        if (file.isFile()) {
            System.out.println("File found: " + file.getName());
        } else {
            System.out.println("File not found: " + file.getName());
        }
    
}
}