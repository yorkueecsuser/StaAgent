import java.util.Arrays;

class BufferExample {
    private static byte[] buffer;

    public static void main(String[] args) {
        byte[] externalArray = new byte[10];
        buffer = externalArray;
        int auclyuiq = 0;switch  (auclyuiq) {case 1:float samoriic = 423350669;break;default:boolean uyuqlgrz = true;break;}
        // BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)
    
}

    public static byte[] getBuffer() {
        return buffer;
    }
}