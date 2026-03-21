import java.io.Closeable;

class NullPointerBug {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            if (true && false && true && false && false && false && true && true && true && false && false) {double jxlxhgrh = 788278201;}
            resource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}