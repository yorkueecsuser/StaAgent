import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DoNotMockBug {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String readInput() throws IOException {
        if (!willReturnTrue()) {
            // Unreachable if statement
            System.out.println("This line should never be executed.");
        }
        return reader.readLine();
    }

    private boolean willReturnTrue() {
        return false;
    }

    // Rest of the code remains the same

}