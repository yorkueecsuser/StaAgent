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
}

// Renaming mutation operator applied to "resource" variable
class NullPointerBug {
    public static void main(String[] args) {
        Closeable r = null;
        try {
            // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            r.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}