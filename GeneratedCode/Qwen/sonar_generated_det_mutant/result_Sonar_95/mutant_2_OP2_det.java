import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class ObjectOutputStreamBugExample {
public void showBug(String fileName)throws IOException {
    FileOutputStream fos = new FileOutputStream(fileName , true);
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos = new ObjectOutputStream(fos);
    oos.writeObject("Hello, World!");
    oos.close();
    fos.close();
}

    public static void main(String[] args) {
        try {
            ObjectOutputStreamBugExample example = new ObjectOutputStreamBugExample();
            example.showBug("example.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}