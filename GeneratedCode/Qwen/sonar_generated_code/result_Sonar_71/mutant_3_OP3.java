import java.util.Optional;

class OptionalBugExample {

    public String showBug() {
        Optional<String> value = getOptionalValue();

        //...
        
        String stringValue = value.get(); // BUG: Optional value should only be accessed after calling isPresent()

        // Inserting unreachable if branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable
            stringValue = "This will never be executed";
        }

        return stringValue;
    }

    public void showBug2() {
        if (methodThatReturnsOptional().isEmpty()) {
            throw new RuntimeException("Not found");
        }
        String value = methodThatReturnsOptional().get(); // BUG: Optional value should only be accessed after calling isPresent()

        // Inserting unreachable if branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable
            value = "This will never be executed";
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

    private boolean getUnreachableCondition() {
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