import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MustBeClosedCheckerBug {
    public void showBug() throws IOException {
        BufferedReader reader = createBufferedReader();
        reader.readLine();

        // Mutant: Unreachable switch statement
        boolean condition = false;
        int value = getValue();
        if (condition) {
            switch (value) {
                case 1:
                    System.out.println("This line is unreachable");
                    break;
            }
        }
    }

    public BufferedReader createBufferedReader() throws IOException {
        return new BufferedReader(new FileReader("example.txt"));
    }

    private int getValue() {
        return 0;
    }
}