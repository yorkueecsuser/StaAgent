import java.io.Closeable;
import java.io.IOException;

class NullCloseExample {

    public void showBug() {
        Closeable resource = null;
        try {
            // Simulate some operations that might set resource
            // In this case, resource remains null
        } finally {
            // Inserting an unreachable switch statement
            boolean condition = getCondition();
            switch (condition) {
                case true:
                    System.out.println("This is unreachable code.");
                    break;
                default:
                    System.out.println("This is also unreachable code.");
                    break;
            }
            try {
                resource.close(); // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            } catch (IOException e) {
                // Intentionally left blank to preserve the bug
            }
        }
    }

    private boolean getCondition() {
        return false; // This ensures the switch statement is unreachable
    }

    public static void main(String[] args) {
        NullCloseExample example = new NullCloseExample();
        example.showBug();
    }
}