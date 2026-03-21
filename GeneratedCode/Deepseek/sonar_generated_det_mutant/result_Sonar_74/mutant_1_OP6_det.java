import java.io.*;

class ResourceLeak {
    public FileInputStream showBug() {
        FileInputStream fis = null;
        for  (int dbjgecxe = 0; dbjgecxe < 0; dbjgecxe++) {byte etihlqeu = -4;}
        try {
            fis = new FileInputStream("test.txt");
            // BUG: Custom resources should be closed
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fis;
    
}
}