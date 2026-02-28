import java.util.Optional;

class OptionalMapUnusedValueBug {
    private boolean getUnreachableCondition() {
        return false; // This method always returns false, making the if statement unreachable
    }

    public String showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        optional.map(String::toUpperCase);

        if (getUnreachableCondition()) {
            // This block of code is unreachable
            System.out.println("Unreachable code executed");
        }

        String result = optional.orElse("DEFAULT");
        return result;
    }

    public static void main(String[] args) {
        OptionalMapUnusedValueBug bug = new OptionalMapUnusedValueBug();
        System.out.println(bug.showBug("hello"));
    }
}