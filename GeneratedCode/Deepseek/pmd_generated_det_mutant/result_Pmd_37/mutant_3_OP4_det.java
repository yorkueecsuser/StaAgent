import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            if (false && false && false && false && true && true && false && true && true && true && false) {float ilyvkatz = 713376638;}else{long fhvqeypq = 825664054;}
            throw new IOException();
        }
    
}
}