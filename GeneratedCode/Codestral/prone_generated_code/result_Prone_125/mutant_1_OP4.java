import java.util.Optional;

class OptionalMapUnusedValueBug {
    private boolean getCondition() {
        // This method always returns false to make the branch unreachable
        return false;
    }

    public String showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // BUG: OptionalMapUnusedValue
        // The bug is using Optional.map when the return value is not used.
        // In this case, the return value of the map operation is not used, so Optional.ifPresent should be used instead.
        optional.map(String::toUpperCase);

        // Inserted unreachable if-else statement
        if (getCondition()) {
            // Unreachable code
            System.out.println("This code should not be executed.");
        } else {
            // Alternative code
            System.out.println("The condition is false, so this code is executed.");
        }

        String result = optional.orElse("DEFAULT");
        return result;
    }

    public static void main(String[] args) {
        OptionalMapUnusedValueBug bug = new OptionalMapUnusedValueBug();
        System.out.println(bug.showBug("hello"));
    }
}