import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            boolean alwaysFalse = false;
            if (alwaysFalse) {
                // This code will never be executed, thus it will not generate unreachable code error
                throw new IOException();
            }
        }
    }
}