import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            boolean shouldThrow = getCondition();
            if (shouldThrow) {
                // Mutant code being added - Unreachable if-else statement
                throw new IOException();
            }
        }
    }
}