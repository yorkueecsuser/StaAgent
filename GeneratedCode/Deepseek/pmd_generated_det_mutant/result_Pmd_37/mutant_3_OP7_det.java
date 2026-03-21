import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            boolean hnbwxows = false;while (hnbwxows && true && true && true && false && true && false && false && false && true && false && false) {float kvagdcsl = -967031968;}
            throw new IOException();
        }
    
}
}