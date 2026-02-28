import java.util.Optional;

class BuggyCode {
    public static void showBug(Optional<String> optional) {
        Optional<String> a = optional; // Mutant: Renamed 'optional' to 'a'
        a.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    }

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}