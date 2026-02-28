import java.util.Optional;

class OptionalMapUnusedValueBug {
    public String showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // BUG: OptionalMapUnusedValue
        // The bug is using Optional.map when the return value is not used.
        // In this case, the return value of the map operation is not used, so Optional.ifPresent should be used instead.
        optional.map(String::toUpperCase);

        // Added Mutant: Unreachable while loop
        boolean unreachableCondition = isUnreachableCondition();
        while (unreachableCondition) {
            // This code inside while loop will never be executed
            System.out.println("This is an unreachable while loop");
        }

        String result = optional.orElse("DEFAULT");
        return result;
    }

    private boolean isUnreachableCondition() {
        return false; // Always returns false making the while loop unreachable
    }

    public static void main(String[] args) {
        OptionalMapUnusedValueBug bug = new OptionalMapUnusedValueBug();
        System.out.println(bug.showBug("hello"));
    }
}