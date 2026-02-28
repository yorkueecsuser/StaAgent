import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

class CheckSkipResult {

    private FileInputStream _s;

    public CheckSkipResult() throws IOException {
        _s = new FileInputStream("file");
    }

    public void skip(int n) throws IOException {
        _s.skip(n);
        _s.skip(n); // Mutant: Duplicated assignment statement
    }

    public void showBug(int n) throws IOException {
        long skipped = _s.skip(n);
        long skippedDuplicate = _s.skip(n); // Mutant: Duplicated assignment statement
        if (skipped < n) {
            System.out.println("Buggy behavior: Only " + skipped + " bytes were skipped instead of " + n);
        }
        if (skippedDuplicate < n) {
            System.out.println("Duplicated buggy behavior: Only " + skippedDuplicate + " bytes were skipped instead of " + n);
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