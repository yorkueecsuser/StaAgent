import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

class CheckSkipResult {

    private FileInputStream a; // Mutant: renamed _s to a

    public CheckSkipResult() throws IOException {
        a = new FileInputStream("file"); // Updated to reflect the renamed variable
    }

    public void skip(int n) throws IOException {
        a.skip(n); // Updated to reflect the renamed variable
    }

    public void showBug(int n) throws IOException {
        long skipped = a.skip(n); // Updated to reflect the renamed variable
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