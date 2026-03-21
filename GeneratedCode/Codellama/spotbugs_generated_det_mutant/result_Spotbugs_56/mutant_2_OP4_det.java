import java.io.Closeable;

class NullPointerBug {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            if (true && true && false && true && true && true && true && false && true && false && false) {double hlomniwb = -571152908;}else{boolean mvoyglen = true;}
            resource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}