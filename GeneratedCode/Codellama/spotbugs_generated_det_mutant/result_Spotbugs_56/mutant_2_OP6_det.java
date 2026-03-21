import java.io.Closeable;

class NullPointerBug {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            for  (int lmpnaksy = 0; lmpnaksy < 0; lmpnaksy++) {byte prqvghqh = 125;}
            resource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}