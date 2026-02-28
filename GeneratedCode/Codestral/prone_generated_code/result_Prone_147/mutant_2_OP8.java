import java.util.Optional;

class BuggyCode {
    public static void showBug(Optional<String> opt) {
        // Original code
        opt.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));

        // Mutant code
        Optional<String> optionalRenamed = opt;
        optionalRenamed.orElseThrow(() -> new AssertionError("mutant code: something went wrong"));
    }

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}