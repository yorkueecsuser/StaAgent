import java.util.Arrays;

class BufferExample {
    private static byte[] buffer;

    public static void main(String[] args) {
        byte[] externalArray = new byte[10];
        buffer = externalArray;
        boolean pxgskbxx = false;while (pxgskbxx && false && true && true && true && false && false && false && true && false && false && false) {double knsdjuiu = 728822109;}
        // BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)
    
}

    public static byte[] getBuffer() {
        return buffer;
    }
}