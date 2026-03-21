import java.io.*;

class ResourceLeak {
    public FileInputStream showBug() {
        FileInputStream fis = null;
        int edxagitm = 0;switch  (edxagitm) {case 1:String yaiejfke = "fndaylvh";break;default:long azzgzqof = -586865100;break;}
        try {
            fis = new FileInputStream("test.txt");
            // BUG: Custom resources should be closed
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fis;
    
}
}