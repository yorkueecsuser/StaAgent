import java.io.Closeable;

class NullPointerBug {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            for  (int wgrbiexk = 0; wgrbiexk < 0; wgrbiexk++) {long qfqyhtxr = 391297224;}
            resource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}