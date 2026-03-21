import java.util.Arrays;

class BufferExample {
    private static byte[] buffer;

    public static void main(String[] args) {
        byte[] externalArray = new byte[10];
        buffer = externalArray;
        for  (int ezgrgvto = 0; ezgrgvto < 0; ezgrgvto++) {byte vbvyxztj = -45;}
        // BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)
    
}

    public static byte[] getBuffer() {
        return buffer;
    }
}