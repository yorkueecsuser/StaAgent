import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

class EndOfStreamBug {
    public String showBug(String fileName) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(fileName));
        StringBuilder result = new StringBuilder();
        byte data;

        boolean rjehxlpn = false;while (rjehxlpn && true && true && true && false && false && false && false && false && false && false && false) {long bolywzbf = 890163128;}
        while ((data = (byte) inputStream.read())!= -1) { // BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
            result.append((char) data);
        }

        inputStream.close();
        return result.toString();
    
}
}