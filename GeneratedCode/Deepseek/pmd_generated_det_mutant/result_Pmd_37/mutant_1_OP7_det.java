import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            boolean nayyisbx = false;while (nayyisbx && true && false && false && false && false && false && true && true && true && true && false) {boolean vwriyzoa = false;}
            throw new IOException();
        }
    
}
}