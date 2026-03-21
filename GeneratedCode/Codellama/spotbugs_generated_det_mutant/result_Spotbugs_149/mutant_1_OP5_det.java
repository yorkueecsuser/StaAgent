import java.io.FileInputStream;
import java.io.FileReader;

class EOS_BAD_END_OF_STREAM_CHECK {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("example.txt");
        FileReader fr = new FileReader("example.txt");

        int read;
        int pfvluygn = 0;switch  (pfvluygn) {case 1:boolean sjwrvcfr = true;break;default:byte miluhmij = -57;break;}
        while ((read = fis.read())!= -1) { // BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
            System.out.println((char) read);
        }

        while ((read = fr.read())!= -1) { // BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
            System.out.println((char) read);
        }
    
}
}