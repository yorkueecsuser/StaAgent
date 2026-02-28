import java.util.Optional;

class OptionalBugExample {

    public String showBug() {
        Optional<String> value = getOptionalValue();

        //...
        
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else statement
            if (shouldRun &&!shouldRun) {
                System.out.println("This is an unreachable if block");
            } else {
                System.out.println("This is an unreachable else block");
            }
        }

        String stringValue = value.get(); // BUG: Optional value should only be accessed after calling isPresent()
        return stringValue;
    }

    public void showBug2() {
        if (methodThatReturnsOptional().isEmpty()) {
            throw new RuntimeException("Not found");
        }
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else statement
            if (shouldRun &&!shouldRun) {
                System.out.println("This is an unreachable if block");
            } else {
                System.out.println("This is an unreachable else block");
            }
        }
        String value = methodThatReturnsOptional().get(); // BUG: Optional value should only be accessed after calling isPresent()
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
        // This method returns a condition that will always be true to ensure the if-else is unreachable
        return true;
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