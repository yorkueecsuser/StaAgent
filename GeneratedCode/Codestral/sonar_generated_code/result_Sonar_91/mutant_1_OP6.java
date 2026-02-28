import java.util.Optional;

class OptionalNullBug {
    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str);

        // Mutation: Unreachable for loop
        boolean condition = getFalseCondition();
        for (int i = 0; condition; i++) {
            // This loop is unreachable because the condition is always false
        }

        return optionalStr;
    }

    private boolean getFalseCondition() {
        return false;
    }
}