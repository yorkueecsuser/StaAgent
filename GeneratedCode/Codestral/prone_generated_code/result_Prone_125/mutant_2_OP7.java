import java.util.Optional;

class OptionalMapUnusedValueBug {
    public String showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // BUG: OptionalMapUnusedValue
        optional.map(String::toUpperCase);

        // Inserted unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never be executed
        }

        String result = optional.orElse("DEFAULT");
        return result;
    }

    private boolean getCondition() {
        // This method always returns false, making the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        OptionalMapUnusedValueBug bug = new OptionalMapUnusedValueBug();
        System.out.println(bug.showBug("hello"));
    }
}