import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

class CheckSkipResult {

    private FileInputStream _s;

    public CheckSkipResult() throws IOException {
        _s = new FileInputStream("file");
    }

    public void skip(int n) throws IOException {
        _s.skip(n); // BUG: CheckSkipResult - You are not sure that exactly n bytes are skipped
    }

    public void showBug(int n) throws IOException {
        long jotryqrx = _s.skip(n);
        if (jotryqrx < n) {
            System.out.println("Buggy behavior: Only " + jotryqrx + " bytes were jotryqrx instead of " + n);
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