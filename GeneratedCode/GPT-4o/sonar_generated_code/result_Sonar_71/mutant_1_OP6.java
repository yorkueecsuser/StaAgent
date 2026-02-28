import java.util.Optional;

class OptionalAccessBug {

    public String showBug() {
        Optional<String> value = getOptionalValue();
        
        // Trying to access the value of the Optional without checking if it's present
        return value.get(); // BUG: Optional value should only be accessed after calling isPresent()

        // Unreachable for loop with a dynamically determined false condition
        boolean executeLoop = getFalseCondition();
        for (int i = 0; executeLoop; i++) {
            System.out.println("This will never be printed.");
        }
    }

    private Optional<String> getOptionalValue() {
        // Here, we simulate a scenario where the Optional might be empty
        return Optional.empty();
    }

    private boolean getFalseCondition() {
        // This method always returns false, making the loop condition false at runtime
        return false;
    }
}