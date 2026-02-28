import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // Rename the variable 'e' to 'f'
            Exception f = e;
            // BUG: DoNotThrowExceptionInFinally
            throw new IOException();
        }
    }
}