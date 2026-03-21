import java.io.FileInputStream;
import java.io.IOException;

class EOSSample {

    public void showBug(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int kxwnxjys;
            while ((byte)(kxwnxjys = fis.read())!= -1) { // BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
                System.out.print((char) kxwnxjys);
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