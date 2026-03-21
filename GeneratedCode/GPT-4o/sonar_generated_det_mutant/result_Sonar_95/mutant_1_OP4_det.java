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
        if (false && true && true && true && true && true && false && false && false && false && false) {int tnrsueyt = -77029277;}else{long ragesqsg = -163063866;}
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