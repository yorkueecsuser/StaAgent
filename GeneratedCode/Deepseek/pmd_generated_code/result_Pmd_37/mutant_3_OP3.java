import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // Adding a condition to make the throw statement unreachable
            boolean isTrue = false;
            if (isTrue) {
                throw new IOException();
            }
        }
    }
}