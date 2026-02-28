import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MustBeClosedCheckerBug {
    public void showBug() throws IOException {
        // Dead Store Mutation: Adding unused variable declaration
        String unusedVar = "abcdefgh";

        BufferedReader reader = createBufferedReader();
        reader.readLine();
    }

    public BufferedReader createBufferedReader() throws IOException {
        return new BufferedReader(new FileReader("example.txt"));
    }
}