import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;

class AppendModeObjectOutputStreamBug {

    static class ExampleObject implements Serializable {
        private static final long serialVersionUID = 1L;
        String name;

        ExampleObject(String name) {
            this.name = name;
        }
    }

    public void showBug(String filename) {
        try {
            // Open file in append mode
            FileOutputStream fos = new FileOutputStream(filename, true); // BUG: Files opened in append mode should not be used with "ObjectOutputStream"
            ObjectOutputStream oos = new ObjectOutputStream(fos); // BUG: Files opened in append mode should not be used with "ObjectOutputStream"

            // Write objects to the file
            oos.writeObject(new ExampleObject("Object 1"));
            oos.writeObject(new ExampleObject("Object 2"));

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}