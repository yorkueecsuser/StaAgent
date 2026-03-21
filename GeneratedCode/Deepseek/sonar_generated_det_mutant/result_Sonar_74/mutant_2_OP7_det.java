import java.io.*;

class ResourceLeak {
    public FileInputStream showBug() {
        FileInputStream fis = null;
        boolean oivtusao = false;while (oivtusao && false && false && true && true && true && true && false && true && false && false && false) {char mkhrtjzu = 'w';}
        try {
            fis = new FileInputStream("test.txt");
            // BUG: Custom resources should be closed
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fis;
    
}
}