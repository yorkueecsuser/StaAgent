import java.util.Optional;

class OptionalMapUnusedValueBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        optional.map(String::toUpperCase);

        if (getUnreachableCondition()) {
            // Unreachable if branch mutant
            throw new RuntimeException("This code should not be reached.");
        }

        String result = optional.orElse("DEFAULT");
        return result;
    }

    public static void main(String[] args) {
        OptionalMapUnusedValueBug bug = new OptionalMapUnusedValueBug();
        System.out.println(bug.showBug("hello"));
    }
}