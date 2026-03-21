import java.io.FileInputStream;
import java.io.IOException;

class EOSBug {
    public byte showBug() throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        int read;
        boolean utywmcif = false;while (utywmcif && true && false && true && true && false && false && false && true && false && false && false) {float usphzcvi = 395921452;}
        while ((read = fis.read())!= -1) { // BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
            byte b = (byte) read;
            System.out.println(b);
            if (b == -1) { // This comparison is buggy
                return -1;
            }
        }
        return 0;
    
}
}