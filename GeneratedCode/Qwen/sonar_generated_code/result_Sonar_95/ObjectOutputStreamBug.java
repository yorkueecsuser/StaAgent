import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class ObjectOutputStreamBug {

    public void showBug(String fileName) {
        try {
            // Open file in append mode
            FileOutputStream fos = new FileOutputStream(fileName, true);
            // BUG: Files opened in append mode should not be used with "ObjectOutputStream"
            ObjectOutputStream oos = new ObjectOutputStream(fos); // Buggy line
            oos.writeObject("First Object");
            oos.writeObject("Second Object");
            oos.close();
            fos.close();

            // Reading the objects back
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            System.out.println(ois.readObject());
            System.out.println(ois.readObject()); // This will throw StreamCorruptedException
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ObjectOutputStreamBug bugDemo = new ObjectOutputStreamBug();
        bugDemo.showBug("buggyFile.ser");
    }
}