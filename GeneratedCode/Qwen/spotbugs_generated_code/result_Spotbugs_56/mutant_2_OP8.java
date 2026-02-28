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
                resource.close(); // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
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
    public void mutatedShowBug() {
        Closeable z = null;
        try {
            // Simulate some operations that might set z
            // In this case, z remains null
        } finally {
            try {
                z.close(); // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            } catch (IOException e) {
                // Intentionally left blank to preserve the bug
            }
        }
    }

    public static void mutatedMain(String[] args) {
        NullCloseExample y = new NullCloseExample();
        y.mutatedShowBug();
    }
}