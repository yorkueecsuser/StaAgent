import java.util.Optional;

class BuggyCode {
    public static boolean getCondition() {
        return false; // this method always returns false
    }

    public static void showBug(Optional<String> optional) {
        // Original code
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));

        // Mutant code: unreachable switch statement
        boolean condition = getCondition();
        if (condition) {
            int value = 0; // This value will not affect the switch statement as condition is always false
            switch(value) {
                case 1:
                    System.out.println("This line will never be executed.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}