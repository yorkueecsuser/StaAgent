import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            for  (int helogwll = 0; helogwll < 0; helogwll++) {float kzgavzoe = -291063842;}
            throw new IOException();
        }
    
}
}