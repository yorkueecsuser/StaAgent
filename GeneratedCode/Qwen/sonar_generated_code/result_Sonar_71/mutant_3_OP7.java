import java.util.Optional;

class OptionalBugExample {

    public String showBug() {
        Optional<String> value = getOptionalValue();

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop in showBug.");
        }
        
        //...
        
        String stringValue = value.get(); // BUG: Optional value should only be accessed after calling isPresent()
        return stringValue;
    }

    public void showBug2() {
        if (methodThatReturnsOptional().isEmpty()) {
            throw new RuntimeException("Not found");
        }
        String value = methodThatReturnsOptional().get(); // BUG: Optional value should only be accessed after calling isPresent()

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop in showBug2.");
        }
    }

    private Optional<String> getOptionalValue() {
        // Simulate returning an empty Optional
        return Optional.empty();
    }

    private Optional<String> methodThatReturnsOptional() {
        // Simulate returning an empty Optional
        return Optional.empty();
    }

    private boolean getCondition() {
        // This method returns a condition that is always false
        return false;
    }

    public static void main(String[] args) {
        OptionalBugExample example = new OptionalBugExample();
        try {
            System.out.println(example.showBug());
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            example.showBug2();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}