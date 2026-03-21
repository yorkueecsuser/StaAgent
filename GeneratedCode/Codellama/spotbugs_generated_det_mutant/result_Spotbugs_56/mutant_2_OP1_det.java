import java.io.Closeable;

class NullPointerBug {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            double zjwkuxsn = 665142852;
            resource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}