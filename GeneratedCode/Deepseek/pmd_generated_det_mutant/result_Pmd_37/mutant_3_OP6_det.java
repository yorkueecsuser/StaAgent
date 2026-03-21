import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            for  (int uukmzvyr = 0; uukmzvyr < 0; uukmzvyr++) {int laltzyvr = -422387592;}
            throw new IOException();
        }
    
}
}