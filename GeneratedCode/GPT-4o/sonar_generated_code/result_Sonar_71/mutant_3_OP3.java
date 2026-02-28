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

    // Inserting an unreachable if statement with a dynamic condition
    private void unreachableCodeDemo() {
        boolean condition = getCondition();
        if (condition) {
            // This code will never execute
            System.out.println("This is unreachable");
        }
    }
    
    // Method to provide a dynamic condition for unreachableCodeDemo
    private boolean getCondition() {
        return false; // the method is designed to return false
    }
}