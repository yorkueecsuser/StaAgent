import java.util.Optional;

class ReturnValueIgnoredDemo {

    public void showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // This line demonstrates the bug where the return value of orElseThrow is ignored
        optional.orElseThrow(() -> new AssertionError("Input is null or empty")); // BUG: ReturnValueIgnored

        // Adding an unreachable if statement using a dynamically determined condition
        boolean isUnreachable = getUnreachableCondition();
        if (isUnreachable) {
            System.out.println("This is unreachable code.");
        }
    }

    // Method to provide a condition that always returns false
    private boolean getUnreachableCondition() {
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