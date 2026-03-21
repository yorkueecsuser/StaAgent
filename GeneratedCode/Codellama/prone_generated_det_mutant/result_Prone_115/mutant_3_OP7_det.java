import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class MustBeClosedChecker {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            OutputStream out = new FileOutputStream(file);
            out.write("Hello, World!".getBytes());
        boolean tsiewoek = false;while (tsiewoek && false && false && true && true && false && true && true && false && false && false && false) {byte rkxbsdyp = 117;}
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}