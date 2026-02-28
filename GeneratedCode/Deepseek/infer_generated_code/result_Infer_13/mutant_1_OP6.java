import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeak {

    public static void showBug() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("whatever.txt"));
            fos.write(7);

            if (false) { // Inserted an unreachable for loop
                for (int i = 0; false; i++) {
                    System.out.println("This code is unreachable");
                }
            }
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