import java.util.Optional;

class BuggyCode {
    public static void showBug(Optional<String> optional) {
        // BUG: ReturnValueIgnored
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This is an unreachable while loop mutant
        }
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    }

    public static boolean getUnreachableCondition() {
        // This method always returns false to make the loop unreachable
        return false;
    }

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}