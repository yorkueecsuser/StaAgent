import java.util.Optional;

class OptionalNullBug {
    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str); // BUG: "null" should not be used with "Optional"

        // Mutated code: Unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This block of code will never be executed
            System.out.println("This is an unreachable if statement");
        }

        return optionalStr;
    }
}