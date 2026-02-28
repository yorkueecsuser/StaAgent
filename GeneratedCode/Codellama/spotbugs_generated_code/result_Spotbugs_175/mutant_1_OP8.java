import java.nio.*;

class BufferSharingBug {

    private static int[] data = new int[10];

    public static IntBuffer getBuffer() {
        // BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF)
        return IntBuffer.wrap(data);
    }

    public static void showBug() {
        IntBuffer buffer = getBuffer();
        for (int i = 0; i < buffer.limit(); i++) {
            System.out.println(buffer.get());
        }
    }
}

// Mutant 1: Renaming 'data' to 'd'
class BufferSharingBugMutant1 {

    private static int[] d = new int[10];

    public static IntBuffer getBuffer() {
        // BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF)
        return IntBuffer.wrap(d);
    }

    public static void showBug() {
        IntBuffer buffer = getBuffer();
        for (int i = 0; i < buffer.limit(); i++) {
            System.out.println(buffer.get());
        }
    }
}