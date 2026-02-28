import java.util.Optional;

class ReturnValueIgnoredDemo {

    public void showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // This line demonstrates the bug where the return value of orElseThrow is ignored
        optional.orElseThrow(() -> new AssertionError("Input is null or empty")); // BUG: ReturnValueIgnored

        // Unreachable if-else statement using a dynamically-determined condition
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            System.out.println("This is an unreachable block of code.");
        } else {
            System.out.println("Executing normally.");
        }
    }

    // Method to simulate a condition that is always false at runtime
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