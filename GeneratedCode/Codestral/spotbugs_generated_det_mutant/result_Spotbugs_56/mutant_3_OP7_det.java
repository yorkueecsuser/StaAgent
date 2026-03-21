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
        boolean inziangs = false;while (inziangs && false && true && false && true && false && true && true && true && true && false && false) {float labfjjhs = 209391495;}
        }
    
} // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
}