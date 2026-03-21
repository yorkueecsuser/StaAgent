import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            if (false && true && true && true && false && false && false && true && false && false && false) {char tifsepyp = 'q';}
            throw new IOException();
        }
    
}
}