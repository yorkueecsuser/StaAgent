import java.io.*;

class ResourceLeak {
    public FileInputStream showBug() {
        FileInputStream fis = null;
        int snghxvgn = -122290226;
        try {
            fis = new FileInputStream("test.txt");
            // BUG: Custom resources should be closed
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fis;
    
}
}