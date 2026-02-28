import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

class BugCheckSkipResult {

    private FileInputStream n;  // Mutated variable

    public BugCheckSkipResult() throws IOException {
        n = new FileInputStream("file");
    }

    public void skip(int x) throws IOException {  // Mutated method name
        n.skip(x); 
    }

    public void skipExactly(int y) throws IOException {  // Mutated method name
        byte[] buffer = new byte[y];
        int bytesRead = n.read(buffer);
        if (bytesRead == -1) {
            throw new IOException("EOF");
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