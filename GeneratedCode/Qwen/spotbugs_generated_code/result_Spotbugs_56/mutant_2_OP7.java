import java.io.Closeable;
import java.io.IOException;

class NullCloseExample {

    public void showBug() {
        Closeable resource = null;
        try {
            // Simulate some operations that might set resource
            // In this case, resource remains null
        } finally {
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // Unreachable while loop
            }
            try {
                resource.close(); // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            } catch (IOException e) {
                // Intentionally left blank to preserve the bug
            }
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullCloseExample example = new NullCloseExample();
        example.showBug();
    }
}