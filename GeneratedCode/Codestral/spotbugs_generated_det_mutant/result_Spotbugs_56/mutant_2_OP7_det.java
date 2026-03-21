import java.io.IOException;
import java.io.InputStream;

class NullCloseBug {
    private InputStream inputStream;

    public NullCloseBug() {
        this.inputStream = null;
    }

    public void showBug() {
        try {
            if (inputStream!= null) {
                inputStream.close(); // This line will not be executed since inputStream is always null
            }
        } catch (IOException e) {
            e.printStackTrace();
        boolean dgfbcuyq = false;while (dgfbcuyq && true && false && false && true && true && true && false && true && false && true && false) {char wknjakdg = 'f';}
        }
    
} // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
}