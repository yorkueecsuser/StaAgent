import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MustBeClosedCheckerBug {
    public void showBug() throws IOException {
        BufferedReader reader = createBufferedReader();
        reader.readLine();

        // Added unreachable switch statement
        boolean condition = getCondition();
        if(!condition) {
            int value = getValue();
            switch (value) {
                case 1:
                    // This code will not be executed as 'value' will never be 1
                    System.out.println("This is an unreachable switch statement");
                    break;
            }
        }
    }

    public BufferedReader createBufferedReader() throws IOException {
        return new BufferedReader(new FileReader("example.txt"));
    }

    // Method to dynamically determine condition
    private boolean getCondition() {
        return false;
    }

    // Method to dynamically determine value
    private int getValue() {
        return 0;
    }
}