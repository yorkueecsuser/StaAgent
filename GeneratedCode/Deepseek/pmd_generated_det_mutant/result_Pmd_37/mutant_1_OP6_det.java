import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            for  (int iqfgpddl = 0; iqfgpddl < 0; iqfgpddl++) {double llcufvje = -41066174;}
            throw new IOException();
        }
    
}
}