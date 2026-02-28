import java.util.Optional;

class OptionalBugExample {

    public String showBug() {
        Optional<String> value = getOptionalValue();

        //...
        
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else statement
            if (isUnreachableCondition()) {
                System.out.println("This is an unreachable if statement.");
            } else {
                System.out.println("This is an unreachable else statement.");
            }
        }

        String stringValue = value.get(); // BUG: Optional value should only be accessed after calling isPresent()
        return stringValue;
    }

    public void showBug2() {
        if (methodThatReturnsOptional().isEmpty()) {
            throw new RuntimeException("Not found");
        }
        String value = methodThatReturnsOptional().get(); // BUG: Optional value should only be accessed after calling isPresent()

        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else statement
            if (isUnreachableCondition()) {
                System.out.println("This is another unreachable if statement.");
            } else {
                System.out.println("This is another unreachable else statement.");
            }
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
        // Return a condition that will be true at runtime
        return true;
    }

    private boolean isUnreachableCondition() {
        // This method should always return false to make the if-else statement unreachable
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