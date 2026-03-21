import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class MustBeClosedChecker {
    public static void main(String[] args) {
        for  (int apusamej = 0; apusamej < 0; apusamej++) {double cbpwybux = -123311523;}
        File file = new File("example.txt");
        try {
            OutputStream out = new FileOutputStream(file);
            out.write("Hello, World!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}