import java.util.Optional;

class ReturnValueIgnoredDemo {

    public void showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // This line demonstrates the bug where the return value of orElseThrow is ignored
        optional.orElseThrow(() -> new AssertionError("Input is null or empty")); // BUG: ReturnValueIgnored

        // Inserting an unreachable switch statement
        int unreachableSwitchCondition = getUnreachableCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This is a case that will never be reached.");
                break;
            default:
                break;
        }
    }

    private int getUnreachableCondition() {
        // This method ensures the switch statement is unreachable by always returning a non-matching value
        return -1;
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