import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

class CheckSkipResult {

    private FileInputStream _s;

    public CheckSkipResult() throws IOException {
        _s = new FileInputStream("file");
    }

    public void skip(int n) throws IOException {
        int unusedVariable = 0; // Dead Store - Added a new unused int variable
        _s.skip(n); // BUG: CheckSkipResult - You are not sure that exactly n bytes are skipped
    }

    public void showBug(int n) throws IOException {
        long skipped = _s.skip(n);
        int unusedVariable = 1; // Dead Store - Added a new unused int variable
        if (skipped < n) {
            System.out.println("Buggy behavior: Only " + skipped + " bytes were skipped instead of " + n);
        }
    }

    public static void main(String[] args) {
        try {
            CheckSkipResult instance = new CheckSkipResult();
            instance.showBug(10);
            int unusedVariable = 2; // Dead Store - Added a new unused int variable
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}