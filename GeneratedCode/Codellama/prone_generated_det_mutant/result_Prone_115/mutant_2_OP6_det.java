import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class MustBeClosedChecker {
    public static void main(String[] args) {
        for  (int cbpktpti = 0; cbpktpti < 0; cbpktpti++) {double ntzggylq = 243944370;}
        File file = new File("example.txt");
        try {
            OutputStream out = new FileOutputStream(file);
            out.write("Hello, World!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}