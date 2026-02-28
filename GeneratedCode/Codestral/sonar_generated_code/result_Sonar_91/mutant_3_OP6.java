import java.util.Optional;

class OptionalNullBug {
    public Optional<String> showBug() {
        String str = null;
        Optional<String> optionalStr = Optional.of(str); // BUG: "null" should not be used with "Optional"

        // Mutation: Unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable Code");
        }

        return optionalStr;
    }

    // Dynamically determining the condition at runtime
    static boolean getCondition() {
        // Add your condition logic here
        return false; // Always false to make the loop unreachable
    }
}