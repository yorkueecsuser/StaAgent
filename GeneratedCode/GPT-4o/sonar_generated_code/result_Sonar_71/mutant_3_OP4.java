import java.util.Optional;

class OptionalAccessBug {

    public String showBug() {
        Optional<String> value = getOptionalValue();

        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This branch is never reached.");
        } else {
            System.out.println("This branch is always executed.");
        }
        
        // Trying to access the value of the Optional without checking if it's present
        return value.get(); // BUG: Optional value should only be accessed after calling isPresent()
    }

    private Optional<String> getOptionalValue() {
        // Here, we simulate a scenario where the Optional might be empty
        return Optional.empty();
    }

    private boolean getFalseCondition() {
        // Dynamically get a false condition for unreachable code
        return false;
    }
}