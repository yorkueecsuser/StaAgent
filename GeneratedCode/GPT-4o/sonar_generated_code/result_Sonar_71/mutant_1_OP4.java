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
    
    private void unreachableCode() {
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block is unreachable because condition is always false.");
        } else {
            System.out.println("This block is always executed.");
        }
    }
    
    private boolean getCondition() {
        // Simulating a false condition for the unreachable branch
        return false;
    }
}