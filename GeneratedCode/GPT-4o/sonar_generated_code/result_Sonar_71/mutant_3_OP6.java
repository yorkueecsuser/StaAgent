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

    // This method helps us create an unreachable for loop condition
    private boolean alwaysFalse() {
        return false;
    }

    public void unreachableLoopExample() {
        boolean conditionFor = alwaysFalse();
        for (int i = 0; conditionFor; i++) {
            // This code block is unreachable
            System.out.println("This is unreachable code.");
        }
    }
}