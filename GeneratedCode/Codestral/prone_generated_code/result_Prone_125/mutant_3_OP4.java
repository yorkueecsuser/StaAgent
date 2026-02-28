import java.util.Optional;

class OptionalMapUnusedValueBug {
    public String showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // BUG: OptionalMapUnusedValue
        optional.map(String::toUpperCase);

        // Mutant code based on the Unreachable if-else statement Mutation Operator
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This block of code is unreachable
            System.out.println("Unreachable code block");
        } else {
            // This is the reachable block
            System.out.println("Reachable code block");
        }

        String result = optional.orElse("DEFAULT");
        return result;
    }

    public static void main(String[] args) {
        OptionalMapUnusedValueBug bug = new OptionalMapUnusedValueBug();
        System.out.println(bug.showBug("hello"));
    }
}