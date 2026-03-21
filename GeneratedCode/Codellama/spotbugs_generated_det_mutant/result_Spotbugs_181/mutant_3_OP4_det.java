import java.util.Arrays;

class BufferExample {
    private static byte[] buffer;

    public static void main(String[] args) {
        byte[] externalArray = new byte[10];
        buffer = externalArray;
        if (true && false && false && true && false && true && true && true && true && true && false) {boolean efmzeijz = true;}else{long qsccvgkj = -678606980;}
        // BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)
    
}

    public static byte[] getBuffer() {
        return buffer;
    }
}