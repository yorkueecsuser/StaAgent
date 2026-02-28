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

        // Additional code to make the else branch unreachable
        boolean condition = false;
        if (condition) {
            // This branch is unreachable
            resource.close();
        } else {
            // This branch is reachable
            resource.close();
        }
    }
}