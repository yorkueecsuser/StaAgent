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
        // This method returns false, ensuring the while loop is unreachable
        return false;
    }
    
    public void unreachableLoopExample() {
        boolean condition = getFalseCondition();
        while (condition) {
            // This code block is unreachable
            System.out.println("This will never print");
        }
    }
}