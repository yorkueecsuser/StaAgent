import java.nio.*;

class BufferSharingBug {

    private static int[] data = new int[10];

    public static IntBuffer getBuffer() {
        // BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF)
        //Mutation: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            return IntBuffer.wrap(data);
        } else {
            return IntBuffer.wrap(new int[0]);
        }
    }

    public static void showBug() {
        IntBuffer buffer = getBuffer();
        for (int i = 0; i < buffer.limit(); i++) {
            System.out.println(buffer.get());
        }
    }
}