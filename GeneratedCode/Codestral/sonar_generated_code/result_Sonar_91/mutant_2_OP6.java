import java.util.Optional;

class OptionalNullBug {
    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str); // BUG: "null" should not be used with "Optional"

        // Mutated Java code
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because the condition is always false
            System.out.println("Unreachable code");
        }

        return optionalStr;
    }

    private boolean getCondition() {
        // This method is used to dynamically determine the condition at runtime
        return false;
    }
}