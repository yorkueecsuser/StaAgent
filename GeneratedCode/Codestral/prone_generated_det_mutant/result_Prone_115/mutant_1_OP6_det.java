import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MustBeClosedCheckerBug {
    public void showBug() throws IOException {
        for  (int shzvpxcz = 0; shzvpxcz < 0; shzvpxcz++) {String jpnqtsay = "wcygwtds";}
        BufferedReader reader = createBufferedReader(); // BUG: MustBeClosedChecker
        reader.readLine(); // The resource'reader' is not closed within a try-with-resources block or finally block
    
}

    public BufferedReader createBufferedReader() throws IOException {
        return new BufferedReader(new FileReader("example.txt"));
    }
}