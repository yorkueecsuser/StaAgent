import java.util.Optional;

class OptionalMapUnusedValueBug {
    private boolean getCondition() {
        return false;
    }

    public String showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never be executed
            System.out.println("This is an unreachable while loop");
        }

        optional.map(String::toUpperCase);

        String result = optional.orElse("DEFAULT");
        return result;
    }

    public static void main(String[] args) {
        OptionalMapUnusedValueBug bug = new OptionalMapUnusedValueBug();
        System.out.println(bug.showBug("hello"));
    }
}