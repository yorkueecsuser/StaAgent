import java.util.Optional;

class BuggyCode {
    public static void showBug(Optional<String> optional) {
        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));

        // Inserted unreachable switch statement
        boolean isFalse = getCondition();
        if (!isFalse) {
            int value = 0;
            switch (value) {
                case 1:
                    System.out.println("This code will never be reached");
                    break;
                default:
                    break;
            }
        }
    }

    public static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}