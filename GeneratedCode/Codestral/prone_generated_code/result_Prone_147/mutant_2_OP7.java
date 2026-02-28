import java.util.Optional;

class BuggyCode {
    public static void showBug(Optional<String> optional) {
        // BUG: ReturnValueIgnored
        while (getFalseCondition()) {
            // Unreachable code
            System.out.println("This is an unreachable while loop.");
        }
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    }

    private static boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}