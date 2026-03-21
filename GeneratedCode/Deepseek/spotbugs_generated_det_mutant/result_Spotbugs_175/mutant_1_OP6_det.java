import java.nio.*;
import java.util.Arrays;

class BugExample {
    private static byte[] buffer = new byte[10];

    static {
        Arrays.fill(buffer, (byte)1);
    }

    public static ByteBuffer showBug() {
        for  (int ybdsdvzx = 0; ybdsdvzx < 0; ybdsdvzx++) {int wvrkgwfr = 150803789;}
        // BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF)
        return ByteBuffer.wrap(buffer);
    
}
}