import java.util.Optional;

class OptionalMapUnusedValueBug {
    public String showBug(String input) {
        Optional<String> optional = Optional.ofNullable(input);

        // BUG: OptionalMapUnusedValue
        // The bug is using Optional.map when the return value is not used.
        // In this case, the return value of the map operation is not used, so Optional.ifPresent should be used instead.
        optional.map(String::toUpperCase);

        // MUTANT: Unreachable switch statement
        // Inserting an unreachable switch statement into the program.
        // The switch condition always evaluates to false to make it unreachable.
        boolean shouldRun = false;
        if (shouldRun) {
            int value = 0;
            switch (value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }

        String result = optional.orElse("DEFAULT");
        return result;
    }

    public static void main(String[] args) {
        OptionalMapUnusedValueBug bug = new OptionalMapUnusedValueBug();
        System.out.println(bug.showBug("hello"));
    }
}