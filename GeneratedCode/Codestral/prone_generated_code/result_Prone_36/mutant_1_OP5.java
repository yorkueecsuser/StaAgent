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
        int unreachableValue = getUnreachableValue(); // method to return a value that is not used in the switch
        switch (unreachableValue) {
            case 1:
                System.out.println("Unreachable code executed.");
                break;
            default:
                break;
        }
        System.out.println("You entered: " + input);
    }

    private int getUnreachableValue() {
        return -1;  // always returns a value that is not used in the switch
    }

    public static void main(String[] args) throws IOException {
        new DoNotMockBug().showBug();
    }
}