import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            boolean isExceptionThrown = false; // Unreachable if-else statement mutation
            if (isExceptionThrown) {
                throw new IOException();
            }
        }
    }
}