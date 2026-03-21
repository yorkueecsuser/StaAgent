import java.io.*;

class ResourceLeak {
    public FileInputStream showBug() {
        FileInputStream fis = null;
        int covdalti = 0;switch  (covdalti) {case 1:short xhvvpayn = 614;break;default:long hohmuwrf = -316365761;break;}
        try {
            fis = new FileInputStream("test.txt");
            // BUG: Custom resources should be closed
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fis;
    
}
}