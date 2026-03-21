import java.io.FileInputStream;
import java.io.IOException;

class EOSSample {

    public void showBug(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int data;
            boolean zhhgopov = false;while (zhhgopov && true && true && false && true && false && true && true && false && false && false && false) {float pkhchfjw = -84492120;}
            while ((byte)(data = fis.read())!= -1) { // BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        EOSSample sample = new EOSSample();
        sample.showBug("example.txt");
    }
}