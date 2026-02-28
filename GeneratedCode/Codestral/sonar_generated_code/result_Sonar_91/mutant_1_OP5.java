import java.util.Optional;

class OptionalNullBug {
    private boolean getFalseCondition() {
        return false;
    }

    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str); // BUG: "null" should not be used with "Optional"

        // Mutant code - Unreachable switch statement
        int value = 1; // This value must not match any case below
        boolean condition = getFalseCondition();
        if (condition) { // To ensure the switch statement is unreachable
            switch(value) {
                case 2:
                    // This case is unreachable
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
        }

        return optionalStr;
    }
}