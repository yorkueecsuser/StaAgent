import java.util.Optional;

class OptionalAccessBug {

    public String showBug() {
        Optional<String> value = getOptionalValue();
        
        // Trying to access the value of the Optional without checking if it's present
        return value.get(); // BUG: Optional value should only be accessed after calling isPresent()

        // Mutation: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        }
    }

    private Optional<String> getOptionalValue() {
        // Here, we simulate a scenario where the Optional might be empty
        return Optional.empty();
    }

    // This method is added to dynamically determine the condition
    private boolean getCondition() {
        return false; // This will always return false, making the if block unreachable
    }
}