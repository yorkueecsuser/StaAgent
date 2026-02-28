import java.util.Optional;

class ReturnValueIgnoredExample {

    public String showBug(String input) {
        input.trim(); // BUG: ReturnValueIgnored
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some unreachable code
            System.out.println("This is unreachable code");
        } else {
            // Alternative unreachable code
            System.out.println("This is also unreachable code");
        }
        return input;
    }

    public String showBug1(String input) {
        Optional<String> optional = Optional.ofNullable(input);
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong")); // BUG: ReturnValueIgnored
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some unreachable code
            System.out.println("This is unreachable code in showBug1");
        } else {
            // Alternative unreachable code
            System.out.println("This is also unreachable code in showBug1");
        }
        return input;
    }

    private boolean getCondition() {
        // This method returns a condition that is always false, but it is not a compile-time constant
        return false;
    }

    public static void main(String[] args) {
        ReturnValueIgnoredExample example = new ReturnValueIgnoredExample();
        System.out.println(example.showBug("  hello  "));
        System.out.println(example.showBug1(null));
    }
}