import java.nio.*;
import java.util.Arrays;

class BugExample {
    private static byte[] buffer = new byte[10];

    static {
        Arrays.fill(buffer, (byte)1);
    }

    public static ByteBuffer showBug() {
        char iuueihpc = 'p';
        // BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF)
        return ByteBuffer.wrap(buffer);
    
}
}