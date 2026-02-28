import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // Mutated code: Unreachable for loop
            boolean condition = false;
            if (!condition) {
                for(;;){}
            }
            throw new IOException();
        }
    }
}