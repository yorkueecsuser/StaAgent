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
        boolean condition = false; // Mutation: Unreachable For Loop
        for (int i = 0; condition; i++) {
           System.out.println("This is an unreachable loop");
        }
    }

    public void skipExactly(int n) throws IOException {
        byte[] buffer = new byte[n];
        int bytesRead = _s.read(buffer);
        if (bytesRead == -1) {
            throw new IOException("EOF");
        }
        boolean conditionFor = false; // Mutation: Unreachable For Loop
        for (int i = 0; conditionFor; i++) {
           System.out.println("This is an unreachable loop");
        }
    }

    public void showBug() throws IOException {
        skip(5); 
    }

    public void showBugExactly() throws IOException {
        skipExactly(5); 
    }

    public static void main(String[] args) throws IOException {
        BugCheckSkipResult bugCheckSkipResult = new BugCheckSkipResult();
        bugCheckSkipResult.showBug();
        bugCheckSkipResult.showBugExactly();
    }
}