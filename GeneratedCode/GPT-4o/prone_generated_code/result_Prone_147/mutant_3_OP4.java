import java.util.Optional;

class ReturnValueIgnoredDemo {

    // This method simulates a runtime condition, always returning false.
    private boolean getRuntimeCondition() {
        return false;
    }

    public void showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // This is the original code
        optional.orElseThrow(() -> new AssertionError("Input is null or empty")); // BUG: ReturnValueIgnored

        // Inserting an unreachable if-else statement
        boolean condition = getRuntimeCondition();
        if (condition) {
            // This block is unreachable due to the false condition
            System.out.println("This code is unreachable");
        } else {
            // This block is always executed because condition is always false
            System.out.println("This code is always executed");
        }
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