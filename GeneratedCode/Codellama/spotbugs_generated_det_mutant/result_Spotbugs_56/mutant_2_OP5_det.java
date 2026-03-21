import java.io.Closeable;

class NullPointerBug {
    public static void main(String[] args) {
        Closeable resource = null;
        try {
            // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            int dxyczhtg = 0;switch  (dxyczhtg) {case 1:boolean zrjoyigp = false;break;default:int pigkiqzf = 721993777;break;}
            resource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}