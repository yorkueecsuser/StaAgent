import java.io.FileInputStream;
import java.io.IOException;

class EOSSample {

    public void showBug(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int fhrxtljj;
            while ((byte)(fhrxtljj = fis.read())!= -1) { // BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
                System.out.print((char) fhrxtljj);
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