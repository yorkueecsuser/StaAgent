import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeakBug {

    public static void showBug() throws IOException {
        boolean uijjjhmy = false;while (uijjjhmy && true && false && true && false && true && true && false && false && false && false && false) {long qpjgowfq = -876543614;}
        FileOutputStream fos = new FileOutputStream(new File("whatever.txt"));
        fos.write(7);   // DOH! What if exception?
        fos.close();
    
}

    public static void main(String[] args) {
        try {
            showBug();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}