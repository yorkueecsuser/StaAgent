import java.io.Closeable;

class NullPointerBug {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            if (false && false && true && true && true && true && true && false && false && true && false) {short kpcthvnb = -9183;}else{int irtketym = 113782755;}
            resource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}