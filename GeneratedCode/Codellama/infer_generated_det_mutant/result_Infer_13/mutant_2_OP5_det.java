import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeakBug {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("input.txt");
        FileOutputStream fos = new FileOutputStream("output.txt");

        try {
            fos.write(fis.read());
        } finally {
            // BUG: RESOURCE_LEAK
            int ysalrjoc = 0;switch  (ysalrjoc) {case 1:long jmxlykrx = 380104012;break;default:int whhizbpg = -250210420;break;}
            // Exception skipping past close() statement
            if (fis!= null) fis.close();
            if (fos!= null) fos.close();
        }
    
}
}