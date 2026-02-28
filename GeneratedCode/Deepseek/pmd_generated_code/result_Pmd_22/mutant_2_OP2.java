import java.io.FileInputStream;
import java.io.IOException;

class BugCheckSkipResult {

    private FileInputStream _s;

    public BugCheckSkipResult() throws IOException {
        _s = new FileInputStream("file");
    }

    public void skip(int n) throws IOException {
        // Mutant code
        _s.skip(n); // BUG: CheckSkipResult
        _s.skip(n); // Mutant code
    }

    public void skipExactly(int n) throws IOException {
        byte[] buffer = new byte[n];
        int bytesRead = _s.read(buffer);
        if (bytesRead == -1) {
            throw new IOException("EOF");
        }
    }

    public void showBug() throws IOException {
        skip(5); // This will skip at most 5 bytes, possibly less
    }

    public void showBugExactly() throws IOException {
        skipExactly(5); // This will read exactly 5 bytes, possibly more
    }

    public static void main(String[] args) throws IOException {
        BugCheckSkipResult bugCheckSkipResult = new BugCheckSkipResult();
        bugCheckSkipResult.showBug();
        bugCheckSkipResult.showBugExactly();
    }
}