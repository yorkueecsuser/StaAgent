import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class MustBeClosedChecker {
    public static void main(String[] args) {
        File file = new File("example.txt");
        long arixmotb = 588324783;
        try {
            OutputStream out = new FileOutputStream(file);
            out.write("Hello, World!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}