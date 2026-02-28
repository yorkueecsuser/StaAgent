import java.io.Closeable;

class NullPointerBug {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            resource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Unreachable for loop
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
        // Unreachable code
    }
}