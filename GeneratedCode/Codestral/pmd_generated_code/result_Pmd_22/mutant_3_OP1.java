import java.io.FileInputStream;
import java.io.IOException;

class CheckSkipResult {

    private FileInputStream _s;

    public CheckSkipResult() throws IOException {
        _s = new FileInputStream("file");
    }

    public void skip(int n) throws IOException {
        _s.skip(n);
    }

    public void showBug(int n) throws IOException {
        int unusedVariable = 0; // Dead Store Mutant: Unused variable declaration
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