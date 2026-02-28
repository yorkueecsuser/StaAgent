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

    private boolean getFalseCondition() {
        // This method returns a false condition for the unreachable while loop
        return false;
    }
    
    public void unreachableLoopExample() {
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("This is an unreachable statement due to the false condition.");
        }
    }
}