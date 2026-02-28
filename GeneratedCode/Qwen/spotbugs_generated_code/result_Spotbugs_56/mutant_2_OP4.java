import java.io.Closeable;
import java.io.IOException;

class NullCloseExample {

    public void showBug() {
        Closeable resource = null;
        try {
            // Simulate some operations that might set resource
            // In this case, resource remains null
        } finally {
            boolean shouldRun = getCondition(); // Dynamically determined condition
            if (shouldRun) {
                // This block is unreachable because getCondition() always returns false
                System.out.println("This is an unreachable if block.");
            } else {
                // This block is also unreachable because getCondition() always returns false
                System.out.println("This is an unreachable else block.");
            }
            try {
                resource.close(); // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            } catch (IOException e) {
                // Intentionally left blank to preserve the bug
            }
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the if-else block unreachable
    }

    public static void main(String[] args) {
        NullCloseExample example = new NullCloseExample();
        example.showBug();
    }
}