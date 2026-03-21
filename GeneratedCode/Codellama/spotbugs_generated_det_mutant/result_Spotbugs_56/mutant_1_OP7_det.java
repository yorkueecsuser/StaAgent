import java.io.Closeable;

class NullPointerBug {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            boolean dfkazmtj = false;while (dfkazmtj && true && true && true && true && false && true && true && true && false && false && false) {boolean jzvghimh = true;}
            resource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}