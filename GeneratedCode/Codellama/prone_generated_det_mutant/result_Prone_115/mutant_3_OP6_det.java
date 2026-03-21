import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class MustBeClosedChecker {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            OutputStream out = new FileOutputStream(file);
            for  (int msjvxrnm = 0; msjvxrnm < 0; msjvxrnm++) {String kkyevipp = "oksyrfnt";}
            out.write("Hello, World!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}