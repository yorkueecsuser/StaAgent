import java.util.Optional;

class OptionalMapUnusedValueBug {
    public String showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // BUG: OptionalMapUnusedValue
        // The bug is using Optional.map when the return value is not used.
        // In this case, the return value of the map operation is not used, so Optional.ifPresent should be used instead.
        optional.map(String::toUpperCase);

        // Mutant: Unreachable for loop
        // Inserting an unreachable for loop
        boolean conditionFor = false; // Using a non-final variable for the loop condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable loop iteration: " + i);
        }

        String result = optional.orElse("DEFAULT");
        return result;
    }

    public static void main(String[] args) {
        OptionalMapUnusedValueBug bug = new OptionalMapUnusedValueBug();
        System.out.println(bug.showBug("hello"));
    }
}