import java.util.Optional;

class OptionalMapUnusedValueBug {
    public String showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // BUG: OptionalMapUnusedValue
        optional.map(String::toUpperCase);

        // MUTANT: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This code is unreachable
            throw new RuntimeException("Unreachable code executed");
        } else {
            // This code is also unreachable
            System.out.println("This line should never be executed");
        }

        String result = optional.orElse("DEFAULT");
        return result;
    }

    // Helper method to simulate a dynamically determined unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        OptionalMapUnusedValueBug bug = new OptionalMapUnusedValueBug();
        System.out.println(bug.showBug("hello"));
    }
}