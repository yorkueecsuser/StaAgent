import java.util.Optional;

class BuggyCode {
    public static boolean getUnreachableCondition() {
        return false;
    }

    public static void showBug(Optional<String> optional) {
        if (getUnreachableCondition()) {
            switch (optional.hashCode()) {
                case 1:
                    System.out.println("This is an unreachable case");
                    break;
                default:
                    break;
            }
        }

        optional.orElseThrow(() -> new AssertionError("something has gone terribly wrong"));
    }

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        showBug(optional);
    }
}