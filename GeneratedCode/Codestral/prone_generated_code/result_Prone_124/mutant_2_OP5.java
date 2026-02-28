import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        boolean shouldRun = getCondition();
        if (!shouldRun) {
            int value = 0;
            switch (value) {
                case 1:
                    /* This case will never be reached, as the switch expression is always 0 */
                    System.out.println("Unreachable code");
                    break;
            }
        }
        return opt1 == opt2;
    }

    private boolean getCondition() {
        /* For the purpose of this example, let's assume this method always returns false */
        return false;
    }
}