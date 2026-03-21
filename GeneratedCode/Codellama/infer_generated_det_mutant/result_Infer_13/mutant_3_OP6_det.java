import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeakBug {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("input.txt");
        FileOutputStream fos = new FileOutputStream("output.txt");

        try {
            fos.write(fis.read());
        } finally {
            // BUG: RESOURCE_LEAK
            // Exception skipping past close() statement
            for  (int pnnhdebd = 0; pnnhdebd < 0; pnnhdebd++) {double sdxtfjuo = -525533523;}
            if (fis!= null) fis.close();
            if (fos!= null) fos.close();
        }
    
}
}