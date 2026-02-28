import java.util.Optional;

class BuggyCode {
    public static boolean getFalseCondition() {
        return false;
    }

    public static void showBug(Optional<String> optional) {
        // BUG: ReturnValueIgnored
        boolean falseCondition = getFalseCondition();
        for (int i = 0; falseCondition; i++) {
            System.out.println("This code should not be executed");
        }
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    }

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}