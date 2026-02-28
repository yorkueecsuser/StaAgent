import java.util.Optional;

class BuggyCode {
    public static void showBug(Optional<String> optional) {
        // BUG: ReturnValueIgnored
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));

        // Mutant: Unreachable if statement
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            System.out.println("This code should never be executed");
        }
    }

    private static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}