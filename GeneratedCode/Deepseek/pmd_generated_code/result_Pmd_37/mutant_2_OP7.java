import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // Mutation: Unreachable while loop
            boolean unreachableLoop = false;
            while (unreachableLoop) {
                // This code will never be executed
            }
            throw new IOException();
        }
    }
}