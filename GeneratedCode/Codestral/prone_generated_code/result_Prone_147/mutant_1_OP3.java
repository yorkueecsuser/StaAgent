import java.util.Optional;

class BuggyCode {
    public static boolean getFalseCondition() {
        return false;
    }

    public static void showBug(Optional<String> optional) {
        if (getFalseCondition()) {
            throw new UnsupportedOperationException("Unreachable code");
        }
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    }

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}