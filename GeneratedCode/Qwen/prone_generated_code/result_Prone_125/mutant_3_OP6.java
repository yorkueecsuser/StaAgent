import java.util.Optional;

class OptionalBugExample {

    public String showBug(Optional<String> optionalString) {
        // Using Optional.map when the return value is unused
        optionalString.map(s -> s.toUpperCase()); // BUG: OptionalMapUnusedValue

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
        }

        return optionalString.orElse("Default");
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        OptionalBugExample example = new OptionalBugExample();
        System.out.println(example.showBug(Optional.of("hello")));
        System.out.println(example.showBug(Optional.empty()));
    }
}