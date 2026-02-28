import java.util.Optional;

class BuggyCode {
    private static boolean getFalseCondition() {
        return false;
    }

    public static void showBug(Optional<String> optional) {
        // BUG: ReturnValueIgnored
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));

        // Mutant code: unreachable while loop
        while (getFalseCondition()) {
            System.out.println("This line should never be executed.");
        }
    }

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}