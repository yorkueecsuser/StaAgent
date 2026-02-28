import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // Mutant code: Unreachable while loop
            boolean condition = true;
            while (condition) {
                throw new IOException();
                condition = false;
            }
        }
    }
}