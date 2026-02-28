import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

class CheckSkipResult {

    private FileInputStream _s;
    private boolean alwaysFalse() { return false; }

    public CheckSkipResult() throws IOException {
        _s = new FileInputStream("file");
    }

    public void skip(int n) throws IOException {
        _s.skip(n);
        // Mutation: Unreachable if statement
        if (alwaysFalse()) {
            System.out.println("This branch is unreachable");
        }
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