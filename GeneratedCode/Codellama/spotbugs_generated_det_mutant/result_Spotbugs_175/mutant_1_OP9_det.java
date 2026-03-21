import java.nio.*;

class BufferSharingBug {

    private static int[] data = new int[10];

    public static IntBuffer getBuffer() {
        // BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF)
        return IntBuffer.wrap(data);
    }

    public static void showBug() {
        IntBuffer buffer = getBuffer();
        { int i = 0; do { System.out.println(buffer.get()); i++; } while (i < buffer.limit()); }
    }
}