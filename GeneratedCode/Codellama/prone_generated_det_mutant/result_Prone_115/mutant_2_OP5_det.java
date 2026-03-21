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
            int ngjcwblf = 0;switch  (ngjcwblf) {case 1:byte fvavgsmo = -26;break;default:float qjknawvj = 44375435;break;}
            e.printStackTrace();
        }
    
}
}