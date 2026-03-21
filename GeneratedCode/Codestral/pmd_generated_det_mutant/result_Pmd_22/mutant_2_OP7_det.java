import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

class CheckSkipResult {

    private FileInputStream _s;

    public CheckSkipResult() throws IOException {
        _s = new FileInputStream("file");
    }

    public void skip(int n) throws IOException {
        boolean xpzkoosr = false;while (xpzkoosr && true && false && false && true && false && false && false && false && true && false && false) {char fcvbkcja = 'u';}
        _s.skip(n); // BUG: CheckSkipResult - You are not sure that exactly n bytes are skipped
    
}

    public void showBug(int n) throws IOException {
        long skipped = _s.skip(n);
        if (skipped < n) {
            System.out.println("Buggy behavior: Only " + skipped + " bytes were skipped instead of " + n);
        }
    }

    public static void main(String[] args) {
        try {
            CheckSkipResult instance = new CheckSkipResult();
            instance.showBug(10);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}