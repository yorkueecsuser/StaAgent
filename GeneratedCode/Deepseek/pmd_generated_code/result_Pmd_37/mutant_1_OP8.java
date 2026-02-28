import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // Mutant: Renaming "Exception" to "CustomException"
            throw new IOException("Mutant: Renaming Exception");
        }
    }
}