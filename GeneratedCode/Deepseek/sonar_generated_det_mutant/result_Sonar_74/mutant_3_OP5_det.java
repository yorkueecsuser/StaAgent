import java.io.*;

class ResourceLeak {
    public FileInputStream showBug() {
        FileInputStream fis = null;
        int pondtxnm = 0;switch  (pondtxnm) {case 1:char pbpvcyke = 'h';break;default:boolean zzurjuuf = false;break;}
        try {
            fis = new FileInputStream("test.txt");
            // BUG: Custom resources should be closed
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fis;
    
}
}