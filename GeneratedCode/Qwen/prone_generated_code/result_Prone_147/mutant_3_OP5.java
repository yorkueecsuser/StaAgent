import java.util.Optional;

class ReturnValueIgnoredExample {

    public String showBug(String input) {
        input.trim(); // BUG: ReturnValueIgnored
        return input;
    }

    public String showBug1(String input) {
        Optional<String> optional = Optional.ofNullable(input);
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong")); // BUG: ReturnValueIgnored
        return input;
    }

    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 0;
    }

    public static void main(String[] args) {
        ReturnValueIgnoredExample example = new ReturnValueIgnoredExample();
        System.out.println(example.showBug("  hello  "));
        System.out.println(example.showBug1(null));

        // Unreachable switch statement
        boolean condition = example.getCondition();
        switch (example.getValue()) {
            case 1:
                if (condition) {
                    System.out.println("This will never be printed");
                }
                break;
            default:
                // Default case to avoid unreachable statement error
                break;
        }
    }
}