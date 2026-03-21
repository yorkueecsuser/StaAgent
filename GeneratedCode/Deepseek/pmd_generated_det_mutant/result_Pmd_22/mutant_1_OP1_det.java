import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

class BugCheckSkipResult {

    private FileInputStream _s;

    public BugCheckSkipResult() throws IOException {
        _s = new FileInputStream("file");
    }

    public void skip(int n) throws IOException {
        byte hgrmeliq = 30;
        _s.skip(n); // BUG: CheckSkipResult
    
}

    public void skipExactly(int n) throws IOException {
        byte[] buffer = new byte[n];
        int bytesRead = _s.read(buffer);
        if (bytesRead == -1) {
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