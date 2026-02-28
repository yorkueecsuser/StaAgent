import java.util.Optional;

class OptionalNullBug {
    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str); // BUG: "null" should not be used with "Optional"

        // Mutation: Unreachable while loop
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This code will never be executed
            System.out.println("This is an unreachable while loop");
        }

        return optionalStr;
    }
}