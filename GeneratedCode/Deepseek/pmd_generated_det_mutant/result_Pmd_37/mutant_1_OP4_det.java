import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            if (false && false && true && false && false && false && true && false && false && false && false) {long pwkxjbom = 715192665;}else{double wavlvacj = 514484435;}
            throw new IOException();
        }
    
}
}