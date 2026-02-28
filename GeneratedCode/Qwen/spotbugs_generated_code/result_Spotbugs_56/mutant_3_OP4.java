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
                // This block is intentionally unreachable
                System.out.println("This is an unreachable block.");
            } else {
                // Alternative unreachable block
                System.out.println("This is another unreachable block.");
            }
            try {
                resource.close(); // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            } catch (IOException e) {
                // Intentionally left blank to preserve the bug
            }
        }
    }

    private boolean getCondition() {
        // This method returns a condition that is always false
        return false;
    }

    public static void main(String[] args) {
        NullCloseExample example = new NullCloseExample();
        example.showBug();
    }
}