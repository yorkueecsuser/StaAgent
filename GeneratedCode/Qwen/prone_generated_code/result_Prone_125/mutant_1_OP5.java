import java.util.Optional;

class OptionalBugExample {

    public String showBug(Optional<String> optionalString) {
        // Using Optional.map when the return value is unused
        optionalString.map(s -> s.toUpperCase()); // BUG: OptionalMapUnusedValue
        return optionalString.orElse("Default");

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                System.out.println("This is an unreachable case.");
                break;
            default:
                // This default case will also never be reached
                System.out.println("This is also an unreachable case.");
                break;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }

    public static void main(String[] args) {
        OptionalBugExample example = new OptionalBugExample();
        System.out.println(example.showBug(Optional.of("hello")));
        System.out.println(example.showBug(Optional.empty()));
    }
}