import java.util.Optional;

class ReturnValueIgnoredExample {

    public String showBug(String input) {
        input.trim(); // BUG: ReturnValueIgnored
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because conditionFor is always false
        }
        return input;
    }

    public String showBug1(String input) {
        Optional<String> optional = Optional.ofNullable(input);
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong")); // BUG: ReturnValueIgnored
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because conditionFor is always false
        }
        return input;
    }

    private boolean getCondition() {
        return false; // This method returns false, making the loop condition always false
    }

    public static void main(String[] args) {
        ReturnValueIgnoredExample example = new ReturnValueIgnoredExample();
        System.out.println(example.showBug("  hello  "));
        System.out.println(example.showBug1(null));
    }
}