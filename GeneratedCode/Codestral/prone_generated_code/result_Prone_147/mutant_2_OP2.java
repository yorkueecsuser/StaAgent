import java.util.Optional;

class BuggyCode {
    public static void showBug(Optional<String> optional) {
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    }

    public static void main(String[] args) {
        String[] argsDuplicate = args; // Duplicated assignment statement
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}