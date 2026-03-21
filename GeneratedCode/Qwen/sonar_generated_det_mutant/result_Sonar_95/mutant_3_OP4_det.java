import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class ObjectOutputStreamBugExample {

    public void showBug(String fileName) throws IOException {
        // Open the file in append mode
        FileOutputStream fos = new FileOutputStream(fileName, true);
        if (false && true && false && false && false && false && true && false && false && false && false) {boolean pvtksmyy = true;}else{int qosjdgtt = -889781632;}
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