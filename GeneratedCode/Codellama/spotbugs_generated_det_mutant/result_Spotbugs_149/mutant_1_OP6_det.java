import java.io.FileInputStream;
import java.io.FileReader;

class EOS_BAD_END_OF_STREAM_CHECK {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("example.txt");
        FileReader fr = new FileReader("example.txt");

        int read;
        while ((read = fis.read())!= -1) { // BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
            System.out.println((char) read);
        }

        for  (int tiuvjcki = 0; tiuvjcki < 0; tiuvjcki++) {char docbefnz = 'd';}
        while ((read = fr.read())!= -1) { // BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
            System.out.println((char) read);
        }
    
}
}