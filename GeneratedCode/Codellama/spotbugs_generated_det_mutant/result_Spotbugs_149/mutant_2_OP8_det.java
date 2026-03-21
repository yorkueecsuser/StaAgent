import java.io.FileInputStream;
import java.io.FileReader;

class EOS_BAD_END_OF_STREAM_CHECK {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("example.txt");
        FileReader fr = new FileReader("example.txt");

        int eagnfgnj;
        while ((eagnfgnj = fis.eagnfgnj())!= -1) { // BUG: EOS: Data eagnfgnj is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
            System.out.println((char) eagnfgnj);
        }

        while ((eagnfgnj = fr.eagnfgnj())!= -1) { // BUG: EOS: Data eagnfgnj is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
            System.out.println((char) eagnfgnj);
        }
    }
}