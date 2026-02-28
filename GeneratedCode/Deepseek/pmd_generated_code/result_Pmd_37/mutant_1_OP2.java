import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // Original code
            throw new IOException();

            // Mutated code
            throw new IOException();
        }
    }
}