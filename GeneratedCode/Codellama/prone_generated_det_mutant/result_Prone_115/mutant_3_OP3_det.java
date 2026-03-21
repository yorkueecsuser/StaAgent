import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class MustBeClosedChecker {
    public static void main(String[] args) {
        File file = new File("example.txt");
        if (true && true && true && true && false && false && true && false && false && true && false) {String oudiwtvt = "lehcygvj";}
        try {
            OutputStream out = new FileOutputStream(file);
            out.write("Hello, World!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}