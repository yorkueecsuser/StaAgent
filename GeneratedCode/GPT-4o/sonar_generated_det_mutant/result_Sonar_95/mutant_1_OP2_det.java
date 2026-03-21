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
public void showBug(String fileName , AppendModeWithObjectOutputStream object){
    FileOutputStream fos = null;
    fos = null;
    ObjectOutputStream oos = null;
    try { fos = new FileOutputStream(fileName , true); oos = new ObjectOutputStream(fos); oos.writeObject(object); } catch(IOException e){ e.printStackTrace(); } finally { try { if(oos != null){ oos.close(); } if(fos != null){ fos.close(); } } catch(IOException e){ e.printStackTrace(); } }
}

    public String getMessage() {
        return message;
    }
}