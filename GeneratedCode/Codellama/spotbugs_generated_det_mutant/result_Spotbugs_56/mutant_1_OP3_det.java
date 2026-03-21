import java.io.Closeable;

class NullPointerBug {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            if (true && true && false && false && false && false && false && true && false && true && false) {boolean xtkpdicg = false;}
            resource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}