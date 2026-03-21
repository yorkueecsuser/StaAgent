import java.io.*;

class ResourceLeak {
    public FileInputStream showBug() {
        FileInputStream fis = null;
        boolean ssmhfkjw = false;while (ssmhfkjw && false && false && true && false && true && false && true && true && true && false && false) {char ktjqzpxa = 'j';}
        try {
            fis = new FileInputStream("test.txt");
            // BUG: Custom resources should be closed
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fis;
    
}
}