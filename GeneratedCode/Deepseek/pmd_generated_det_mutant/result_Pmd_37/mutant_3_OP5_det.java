import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            int hkbyxdig = 0;switch  (hkbyxdig) {case 1:String ypgxmtwj = "uzemacpf";break;default:short rasxxnci = 6047;break;}
            throw new IOException();
        }
    
}
}