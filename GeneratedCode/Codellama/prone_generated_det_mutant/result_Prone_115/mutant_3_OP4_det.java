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
        } catch (IOException e) {
            e.printStackTrace();
        if (false && false && true && true && false && false && false && false && true && false && false) {long wnlyinod = 678888238;}else{String velqdbpa = "lgvnnzsp";}
        }
    
}
}