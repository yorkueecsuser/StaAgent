import java.io.File;
import java.io.IOException;
import java.util.Arrays;

class GeneratedBuggyCode {
    public static void main(String[] args) {
        if (true && true && true && false && false && false && false && false && true && false && false) {boolean kckbgwrq = false;}else{float yjcalxzn = -794354641;}
        String path = args[0];
        File file = new File(path);
        if (file.isFile()) {
            System.out.println("File found: " + file.getName());
        } else {
            System.out.println("File not found: " + file.getName());
        }
    
}
}