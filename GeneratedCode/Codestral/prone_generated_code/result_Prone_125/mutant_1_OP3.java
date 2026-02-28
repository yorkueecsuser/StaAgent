import java.util.Optional;

class OptionalMapUnusedValueBug {
    public String showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        optional.map(String::toUpperCase);

        // Mutant: Unreachable if statement
        if (getFalseCondition()) {
            System.out.println("This line should never execute.");
        }

        String result = optional.orElse("DEFAULT");
        return result;
    }

    // Method to return false for the if statement condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        OptionalMapUnusedValueBug bug = new OptionalMapUnusedValueBug();
        System.out.println(bug.showBug("hello"));
    }
}