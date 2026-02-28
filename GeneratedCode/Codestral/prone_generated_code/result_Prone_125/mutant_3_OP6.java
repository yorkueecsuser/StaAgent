import java.util.Optional;

class OptionalMapUnusedValueBug {
    public String showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // BUG: OptionalMapUnusedValue
        optional.map(String::toUpperCase);

        String result = optional.orElse("DEFAULT");

        // Mutation: Unreachable if statement with unreachable for loop
        boolean condition = false;
        if (condition) {
            for (int i = 0; false; i++) {
                // This line will never be executed
                System.out.println("Unreachable code");
            }
        }

        return result;
    }

    public static void main(String[] args) {
        OptionalMapUnusedValueBug bug = new OptionalMapUnusedValueBug();
        System.out.println(bug.showBug("hello"));
    }
}