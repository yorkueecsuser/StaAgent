import java.util.Optional;

class OptionalBugExample {

    public String showBug() {
        Optional<String> value = getOptionalValue();

        //...
        
        String stringValue = value.get(); // BUG: Optional value should only be accessed after calling isPresent()

        // Unreachable switch statement mutation
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is unreachable because getCondition() always returns false
                stringValue = "Unreachable";
                break;
            default:
                // Default case
                break;
        }

        return stringValue;
    }

    public void showBug2() {
        if (methodThatReturnsOptional().isEmpty()) {
            throw new RuntimeException("Not found");
        }
        String value = methodThatReturnsOptional().get(); // BUG: Optional value should only be accessed after calling isPresent()

        // Unreachable switch statement mutation
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is unreachable because getCondition() always returns false
                value = "Unreachable";
                break;
            default:
                // Default case
                break;
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
        // Always return false to make the switch statement unreachable
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