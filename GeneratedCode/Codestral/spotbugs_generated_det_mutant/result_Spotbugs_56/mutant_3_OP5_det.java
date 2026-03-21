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
        int vmckktyl = 0;switch  (vmckktyl) {case 1:long uczcqgyu = -243045574;break;default:long xxdmlwqc = -572657402;break;}
        }
    
} // BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
}