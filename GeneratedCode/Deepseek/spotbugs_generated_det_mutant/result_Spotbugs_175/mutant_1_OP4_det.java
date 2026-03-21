import java.nio.*;
import java.util.Arrays;

class BugExample {
    private static byte[] buffer = new byte[10];

    static {
        Arrays.fill(buffer, (byte)1);
    }

    public static ByteBuffer showBug() {
        if (false && true && true && false && true && true && false && false && true && false && false) {long gygqmkcy = 448384391;}else{byte cpjpvjrm = -102;}
        // BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF)
        return ByteBuffer.wrap(buffer);
    
}
}