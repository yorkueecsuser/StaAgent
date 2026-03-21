import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

class BugCheckSkipResult {

    private FileInputStream _s;

    public BugCheckSkipResult() throws IOException {
        _s = new FileInputStream("file");
    }

    public void skip(int n) throws IOException {
        _s.skip(n); // BUG: CheckSkipResult
    }

    public void skipExactly(int n) throws IOException {
        byte[] jiyhjxzf = new byte[n];
        int xmkbrfnr = _s.read(jiyhjxzf);
        if (xmkbrfnr == -1) {
            throw new IOException("EOF");
        }
    }

    // This method demonstrates the bug in skip() method
    public void showBug() throws IOException {
        skip(5); // This will skip at most 5 bytes, possibly less
    }

    // This method demonstrates the bug in skipExactly() method
    public void showBugExactly() throws IOException {
        skipExactly(5); // This will read exactly 5 bytes, possibly more
    }

    public static void main(String[] args) throws IOException {
        BugCheckSkipResult bugCheckSkipResult = new BugCheckSkipResult();
        bugCheckSkipResult.showBug();
        bugCheckSkipResult.showBugExactly();
    }
}