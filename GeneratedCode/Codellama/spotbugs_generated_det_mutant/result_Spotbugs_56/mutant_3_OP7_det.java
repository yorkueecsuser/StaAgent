import java.io.Closeable;

class NullPointerBug {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            boolean jojrfyqg = false;while (jojrfyqg && true && false && false && false && true && true && true && true && true && false && false) {float vhnfhrza = -689166756;}
            resource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}