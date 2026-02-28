import java.util.Optional;

class BuggyCode {
    public static boolean alwaysFalse() {
        return false;
    }

    public static void showBug(Optional<String> optional) {
        if (alwaysFalse()) {
            // This is the unreachable code inserted by the mutation operator
            throw new AssertionError("this code should never be executed");
        } else {
            // BUG: ReturnValueIgnored
            optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
        }
    }

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}