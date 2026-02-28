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
    }

    public void showBug(int n) throws IOException {
        long skipped = _s.skip(n);
        if (skipped < n) {
            System.out.println("Buggy behavior: Only " + skipped + " bytes were skipped instead of " + n);

            // Mutant Code: Unreachable switch statement
            boolean runSwitch = getCondition();
            if (runSwitch) {
                int value = 0;
                switch (value) {
                    case 1:
                        System.out.println("This line should never be reached");
                        break;
                    default:
                        break;
                }
            }
        }
    }

    private boolean getCondition() {
        return false; // Always return false to make the switch unreachable
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