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
        for  (int lhcuftlq = 0; lhcuftlq < 0; lhcuftlq++) {char jguulrok = 's';}
        }
    
} // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
}