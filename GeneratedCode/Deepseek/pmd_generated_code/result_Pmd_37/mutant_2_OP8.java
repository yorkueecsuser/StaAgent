import java.io.IOException;

class DoNotThrowExceptionInFinally2 {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // Mutated code
            throw new IOException();
        }
    }
}