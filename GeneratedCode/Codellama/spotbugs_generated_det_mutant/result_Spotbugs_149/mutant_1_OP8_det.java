import java.io.FileInputStream;
import java.io.FileReader;

class EOS_BAD_END_OF_STREAM_CHECK {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("example.txt");
        FileReader fr = new FileReader("example.txt");

        int qgfbzdqq;
        while ((qgfbzdqq = fis.qgfbzdqq())!= -1) { // BUG: EOS: Data qgfbzdqq is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
            System.out.println((char) qgfbzdqq);
        }

        while ((qgfbzdqq = fr.qgfbzdqq())!= -1) { // BUG: EOS: Data qgfbzdqq is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
            System.out.println((char) qgfbzdqq);
        }
    }
}