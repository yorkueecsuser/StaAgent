import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeak {
    public static void showBug() {
        FileOutputStream fos = null;
        int unusedVariable = 10;   // Dead Store Mutant
        try {
            fos = new FileOutputStream(new File("whatever.txt"));
            fos.write(7);   
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos!= null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}