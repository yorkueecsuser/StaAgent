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
        int mvcdfhby = 0;switch  (mvcdfhby) {case 1:float krdtzstp = 508471129;break;default:short yugakojh = -6005;break;}
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