import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MustBeClosedCheckerBug {
    public void showBug() throws IOException {
        BufferedReader reader = createBufferedReader(); // BUG: MustBeClosedChecker
        // Duplication of the assignment statement
        BufferedReader readerDuplicate = createBufferedReader();
        reader.readLine();
        // Since the duplicate reader is not used, it's not closed here to avoid resource leak
    }

    public BufferedReader createBufferedReader() throws IOException {
        return new BufferedReader(new FileReader("example.txt"));
    }
}