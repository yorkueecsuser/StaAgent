import java.util.Optional;

class BuggyCode {
    public static void showBug(Optional<String> opt) {
        opt.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    }

    public static void main(String[] args) {
        Optional<String> option = Optional.empty();
        showBug(option);
    }
}