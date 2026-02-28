import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            boolean alwaysFalse = false;
            while (alwaysFalse) {
                // Unreachable code to avoid unreachable statement error
            }
            throw new IOException();
        }
    }
}