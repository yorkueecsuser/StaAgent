import java.util.Optional;

class BuggyCode {
    public static void showBug(Optional<String> optional) {
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));

        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code will never be executed
        }
    }

    private static boolean getCondition() {
        // Always return false to make the loop unreachable
        return false;
    }

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}