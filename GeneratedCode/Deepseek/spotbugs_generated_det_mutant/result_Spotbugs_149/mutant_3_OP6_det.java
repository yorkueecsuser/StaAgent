import java.io.FileInputStream;
import java.io.IOException;

class EOSBug {
    public byte showBug() throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        int read;
        for  (int mtfxerbj = 0; mtfxerbj < 0; mtfxerbj++) {short wizpbenv = -570;}
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