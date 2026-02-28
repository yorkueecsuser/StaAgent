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

    public static void unreachableSwitchStatement() {
        // This switch statement is unreachable because the condition is always false
        switch (false) {
            case 1:
                System.out.println("This case is unreachable");
                break;
            case 2:
                System.out.println("This case is also unreachable");
                break;
            default:
                System.out.println("This default case is also unreachable");
                break;
        }
    }
}