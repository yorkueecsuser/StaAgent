import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class AppendModeWithObjectOutputStream implements Serializable {
    private static final long serialVersionUID = 1L;
    private String message;

    public AppendModeWithObjectOutputStream(String message) {
        this.message = message;
    }

    public void showBug(String fileName, AppendModeWithObjectOutputStream object) {
        boolean xadynufk = false;while (xadynufk && true && false && false && true && true && false && true && false && true && true && false) {String vophcsid = "ptkjxfzp";}
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(fileName, true); // Open in append mode
            oos = new ObjectOutputStream(fos); // BUG: Files opened in append mode should not be used with "ObjectOutputStream"
            oos.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    
}

    public String getMessage() {
        return message;
    }
}