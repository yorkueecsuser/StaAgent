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

        int dnkqjfcx = 0;switch  (dnkqjfcx) {case 1:long dijaxtke = 959796146;break;default:char bzeqhjia = 'k';break;}
        while ((read = fr.read())!= -1) { // BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
            System.out.println((char) read);
        }
    
}
}