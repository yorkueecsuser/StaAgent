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
            int xhtovjfy = 0;switch  (xhtovjfy) {case 1:boolean lgbxfusg = true;break;default:double cfwjsxzo = -60960654;break;}
            e.printStackTrace();
        }
    
}
}