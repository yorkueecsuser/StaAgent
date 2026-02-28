import java.util.Optional;

class BuggyCode {
    public static boolean getUnreachableCondition() {
        return false;
    }

    public static void showBug(Optional<String> optional) {
        if (getUnreachableCondition()) {
            System.out.println("This line should never execute");
        }
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    }

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}