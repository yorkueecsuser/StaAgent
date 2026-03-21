import java.io.Closeable;

class NullPointerBug {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            if (true && false && false && false && false && true && true && true && false && true && false) {int iwlailsh = 821156877;}else{byte joajylly = -51;}
            resource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}