import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DoNotMockBug {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String readInput() throws IOException {
        return reader.readLine();
    }

    public void showBug() throws IOException {
        System.out.println("Enter some input: ");
        String input = readInput();

        boolean shouldNotExecute = getCondition();
        if (shouldNotExecute) {
            // This block is unreachable as shouldNotExecute is always false
            System.out.println("This is an unreachable block.");
        } else {
            System.out.println("You entered: " + input);
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) throws IOException {
        new DoNotMockBug().showBug();
    }
}