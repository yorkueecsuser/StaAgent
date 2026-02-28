import java.io.Closeable;
import java.io.IOException;

class NullCloseExample {

    public void showBug() {
        Closeable resource = null;
        try {
            // Simulate some operations that might set resource
            // In this case, resource remains null
        } finally {
            boolean shouldClose = true;
            do {
                try {
                    if (shouldClose) {
                        resource.close(); // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
                        shouldClose = false;
                    }
                } catch (IOException e) {
                    // Intentionally left blank to preserve the bug
                }
            } while (shouldClose);
        }
    }

    public static void main(String[] args) {
        NullCloseExample example = new NullCloseExample();
        example.showBug();
    }
}