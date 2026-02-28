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

    private boolean alwaysFalseCondition() {
        return false;
    }

    public void unreachableCodeExample() {
        boolean condition = alwaysFalseCondition();
        if (condition) {
            System.out.println("This block is unreachable");
        } else {
            // This block will always execute
            System.out.println("This block is always reachable");
        }
    }
}