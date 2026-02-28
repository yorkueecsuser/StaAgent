import java.util.Optional;

class OptionalAccessBug {

    public String showBug() {
        Optional<String> value = getOptionalValue();
        
        // Trying to access the value of the Optional without checking if it's present
        return value.get(); // BUG: Optional value should only be accessed after calling isPresent()
    }

    private Optional<String> getOptionalValue() {
        // Here, we simulate a scenario where the Optional might be empty
        return Optional.empty();
    }
    
    // Inserting an unreachable while loop
    private void unreachableLoop() {
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This block is unreachable because conditionWhile is always false
        }
    }

    // This method returns false to simulate an unreachable loop
    private boolean getUnreachableCondition() {
        return false;
    }
}