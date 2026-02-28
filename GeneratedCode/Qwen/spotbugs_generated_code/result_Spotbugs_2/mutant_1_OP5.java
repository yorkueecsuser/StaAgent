import java.util.Optional;

class OptionalBugExample {

    // Method with Optional return type that incorrectly returns explicit null
    public Optional<String> getOptionalValue(boolean returnNull) {
        if (returnNull) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL) 
        }
        return Optional.of("Valid Value");

        // Unreachable switch statement inserted here
        boolean condition = getUnreachableCondition();
        switch (condition) {
            case true:
                System.out.println("This is an unreachable switch case.");
                break;
            default:
                System.out.println("This is also an unreachable switch case.");
                break;
        }
    }

    // Public method to demonstrate the bug
    public String showBug(boolean returnNull) {
        Optional<String> result = getOptionalValue(returnNull);
        if (result!= null) {
            return result.orElse("Default Value");
        } else {
            return "Null Returned";
        }
    }

    public static void main(String[] args) {
        OptionalBugExample example = new OptionalBugExample();
        System.out.println(example.showBug(true));  // This will demonstrate the bug
        System.out.println(example.showBug(false)); // This will not demonstrate the bug
    }

    // Helper method to provide a dynamic condition for the unreachable switch statement
    private boolean getUnreachableCondition() {
        return false; // This method always returns false, ensuring the switch statement is unreachable
    }
}