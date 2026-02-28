import java.util.Optional;

class ReturnValueIgnoredDemo {

    public void showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // This line demonstrates the bug where the return value of orElseThrow is ignored
        optional.orElseThrow(() -> new AssertionError("Input is null or empty")); // BUG: ReturnValueIgnored

        // Mutant: Unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }
    }

    // Helper method to provide a non-final condition
    private boolean getUnreachableCondition() {
        return false; // Since this is calculated at runtime, it does not cause a compilation error.
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