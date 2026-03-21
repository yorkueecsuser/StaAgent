import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            if (true && false && true && false && false && true && false && false && true && true && false) {boolean ztwhbkcz = true;}
            throw new IOException();
        }
    
}
}