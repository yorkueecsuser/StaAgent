import java.util.Optional;

class BuggyCode {
    public static void showBug(Optional<String> optional) {
        // BUG: ReturnValueIgnored
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));

        // Dead Store mutation operator
        String unusedVariable = "deadstore";
    }

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}