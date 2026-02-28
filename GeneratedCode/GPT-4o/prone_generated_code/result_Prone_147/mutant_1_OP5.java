import java.util.Optional;

class ReturnValueIgnoredDemo {

    public void showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // This line demonstrates the bug where the return value of orElseThrow is ignored
        optional.orElseThrow(() -> new AssertionError("Input is null or empty")); // BUG: ReturnValueIgnored

        // Inserting an unreachable switch statement
        int unreachableValue = getUnreachableValue(); // Ensure this method always returns a value that doesn't match any case
        switch (unreachableValue) {
            case 1:
                System.out.println("Unreachable case 1");
                break;
            case 2:
                System.out.println("Unreachable case 2");
                break;
            default:
                // This is the only reachable block
                System.out.println("Default case");
                break;
        }
    }

    // Method to ensure the switch statement is unreachable
    private int getUnreachableValue() {
        return 3; // Ensures the unreachableValue does not match any case labels
    }

    public static void main(String[] args) {
        ReturnValueIgnoredDemo demo = new ReturnValueIgnoredDemo();
        try {
            demo.showBug(null);
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }
}