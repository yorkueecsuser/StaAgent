import java.io.Closeable;

class NullPointerBug {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            int qawestqc = 0;switch  (qawestqc) {case 1:long dadlrhdw = -102010367;break;default:byte gcfpbzek = 19;break;}
            resource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}