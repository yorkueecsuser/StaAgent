import java.io.Closeable;

class NullPointerBug {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            boolean czzofudm = false;while (czzofudm && false && false && false && true && true && false && true && false && true && false && false) {short mcshxddb = 1631;}
            resource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}