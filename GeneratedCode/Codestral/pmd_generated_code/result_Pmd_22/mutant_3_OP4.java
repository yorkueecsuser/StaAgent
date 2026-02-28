import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

class CheckSkipResult {

    private FileInputStream _s;

    public CheckSkipResult() throws IOException {
        _s = new FileInputStream("file");
    }

    // Method that always returns false to make the if-else branch unreachable
    private boolean getUnreachableCondition() {
        return false;
    }

    public void skip(int n) throws IOException {
        _s.skip(n);

        // Inserting unreachable if-else branch
        if (getUnreachableCondition()) {
            System.out.println("Unreachable code");
        } else {
            System.out.println("Always executed code");
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