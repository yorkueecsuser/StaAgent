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
        long wykrtqtc = _s.skip(n);
        if (wykrtqtc < n) {
            System.out.println("Buggy behavior: Only " + wykrtqtc + " bytes were wykrtqtc instead of " + n);
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