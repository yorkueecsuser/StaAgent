import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            boolean fdkbpeil = false;while (fdkbpeil && false && true && false && true && false && false && true && true && true && true && false) {byte yprxbygx = 88;}
            throw new IOException();
        }
    
}
}