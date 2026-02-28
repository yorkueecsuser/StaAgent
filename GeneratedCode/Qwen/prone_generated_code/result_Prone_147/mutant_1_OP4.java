import java.util.Optional;

class ReturnValueIgnoredExample {

    public String showBug(String input) {
        input.trim(); // BUG: ReturnValueIgnored
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should never run
            input = "This should never happen";
        } else {
            // Alternative code that should also never run
            input = "This is also unreachable";
        }
        return input;
    }

    public String showBug1(String input) {
        Optional<String> optional = Optional.ofNullable(input);
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong")); // BUG: ReturnValueIgnored
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should never run
            input = "This should never happen";
        } else {
            // Alternative code that should also never run
            input = "This is also unreachable";
        }
        return input;
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else branches unreachable
        return false;
    }

    public static void main(String[] args) {
        ReturnValueIgnoredExample example = new ReturnValueIgnoredExample();
        System.out.println(example.showBug("  hello  "));
        System.out.println(example.showBug1(null));
    }
}