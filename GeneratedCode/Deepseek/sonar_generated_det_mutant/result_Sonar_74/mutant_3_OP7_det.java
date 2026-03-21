import java.io.*;

class ResourceLeak {
    public FileInputStream showBug() {
        FileInputStream fis = null;
        boolean pmplsnnf = false;while (pmplsnnf && false && true && true && true && true && true && true && true && false && true && false) {float hdcvpwxb = 308158500;}
        try {
            fis = new FileInputStream("test.txt");
            // BUG: Custom resources should be closed
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fis;
    
}
}