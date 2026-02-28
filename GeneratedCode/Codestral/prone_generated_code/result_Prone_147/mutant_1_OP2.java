import java.util.Optional;

class BuggyCode {
    public static void showBug(Optional<String> optional) {
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
        // Added Mutant Code
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    }

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}