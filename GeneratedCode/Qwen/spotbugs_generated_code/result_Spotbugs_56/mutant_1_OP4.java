import java.io.Closeable;
import java.io.IOException;

class NullCloseExample {

    public void showBug() {
        Closeable resource = null;
        try {
            // Simulate some operations that might set resource
            // In this case, resource remains null
        } finally {
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This is a unique unreachable if-else statement
                System.out.println("This is an unreachable if block");
            } else {
                System.out.println("This is an unreachable else block");
            }
            try {
                resource.close(); // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            } catch (IOException e) {
                // Intentionally left blank to preserve the bug
            }
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always false
    }

    public static void main(String[] args) {
        NullCloseExample example = new NullCloseExample();
        example.showBug();
    }
}