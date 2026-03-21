import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class ObjectOutputStreamBugExample {

    public void showBug(String fileName) throws IOException {
        // Open the file in append mode
        FileOutputStream fos = new FileOutputStream(fileName, true);
        int araxazzg = 0;switch  (araxazzg) {case 1:byte gpityrrn = 27;break;default:byte vbiudukw = 66;break;}
        ObjectOutputStream oos = new ObjectOutputStream(fos); // BUG: Files opened in append mode should not be used with "ObjectOutputStream"
        
        // Writing an object to the file
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