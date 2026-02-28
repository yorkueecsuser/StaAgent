import java.io.Closeable;
import java.io.IOException;

class NullCloseExample {

    public void showBug() {
        Closeable resource = null;
        try {
            // Simulate some operations that might set resource
            // In this case, resource remains null
        } finally {
            try {
                resource.close(); // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            } catch (IOException e) {
                // Intentionally left blank to preserve the bug
            }
        }
    }

    public static void main(String[] args) {
        NullCloseExample example = new NullCloseExample();
        example.showBug();
    }

    // Mutated code with renaming mutation operator
    public void mutatedMethod() {
        Closeable a = null;
        try {
            // Simulate some operations that might set a
            // In this case, a remains null
        } finally {
            try {
                a.close(); // This line retains the bug
            } catch (IOException b) {
                // Intentionally left blank to preserve the bug
            }
        }
    }
}