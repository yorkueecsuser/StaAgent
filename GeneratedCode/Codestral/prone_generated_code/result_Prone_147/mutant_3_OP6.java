import java.util.Optional;

class BuggyCode {
    public static void showBug(Optional<String> optional) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable loop
        }
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    }

    public static boolean getCondition() {
        return false; // The condition is always false to make the loop unreachable
    }

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}