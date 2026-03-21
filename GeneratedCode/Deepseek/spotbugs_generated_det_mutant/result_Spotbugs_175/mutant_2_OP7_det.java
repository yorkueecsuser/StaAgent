import java.nio.*;
import java.util.Arrays;

class BugExample {
    private static byte[] buffer = new byte[10];

    static {
        Arrays.fill(buffer, (byte)1);
    }

    public static ByteBuffer showBug() {
        boolean hjakdpeu = false;while (hjakdpeu && false && true && false && false && false && true && false && true && false && true && false) {double puvuqaxw = -555673686;}
        // BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF)
        return ByteBuffer.wrap(buffer);
    
}
}