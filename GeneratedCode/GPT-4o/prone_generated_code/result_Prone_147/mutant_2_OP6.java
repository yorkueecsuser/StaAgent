import java.util.Optional;

class ReturnValueIgnoredDemo {

    public void showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // This line demonstrates the bug where the return value of orElseThrow is ignored
        optional.orElseThrow(() -> new AssertionError("Input is null or empty")); // BUG: ReturnValueIgnored

        // Unreachable for loop mutant
        boolean conditionFor = getCondition();  // Use a dynamically determined value
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop.");
        }
    }

    // Mock method to simulate dynamic condition evaluation
    private boolean getCondition() {
        return false;  // This makes the loop condition always false
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