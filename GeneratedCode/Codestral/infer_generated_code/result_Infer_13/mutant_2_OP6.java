import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeakBug {

    public static void showBug() throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("whatever.txt"));
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) { // unreachable for loop
            System.out.println("This will never be executed");
        }
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