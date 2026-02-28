import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DoNotMockBug {

    // Mocking BufferedReader for input, which is not desirable in real scenarios
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String readInput() throws IOException {
        return reader.readLine(); // BUG: DoNotMock
    }

    public void showBug() throws IOException {
        System.out.println("Enter some input: ");
        String input = readInput();

        // Mutated code: Unreachable switch statement
        boolean shouldRun = false;
        int value = getValue();
        switch(shouldRun? value : 0) {
            case 1:
                System.out.println("This code will never execute");
                break;
        }

        System.out.println("You entered: " + input);
    }

    private int getValue() {
        return 1; // This value will never be used as the switch condition is always false
    }

    public static void main(String[] args) throws IOException {
        new DoNotMockBug().showBug();
    }
}