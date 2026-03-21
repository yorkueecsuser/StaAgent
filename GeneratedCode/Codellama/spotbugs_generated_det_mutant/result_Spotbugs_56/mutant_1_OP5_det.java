import java.io.Closeable;

class NullPointerBug {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            int tohyxmcf = 0;switch  (tohyxmcf) {case 1:int voplzhok = -913948358;break;default:int hpxqyaba = 399137480;break;}
            resource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}