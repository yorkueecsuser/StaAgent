import java.util.Optional;

class ReturnValueIgnoredDemo {

    public void showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // This line demonstrates the bug where the return value of orElseThrow is ignored
        optional.orElseThrow(() -> new AssertionError("Input is null or empty")); // BUG: ReturnValueIgnored

        // Unreachable if statement. The condition is dynamically determined at runtime.
        boolean alwaysFalse = getCondition();
        if (alwaysFalse) {
            System.out.println("This line is unreachable.");
        }
    }
    
    // Method to simulate a condition that returns false
    private boolean getCondition() {
        return false;
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