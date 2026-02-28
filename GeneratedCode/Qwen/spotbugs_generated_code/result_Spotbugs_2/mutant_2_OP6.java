import java.util.Optional;

class OptionalBugExample {

    // Method with Optional return type that incorrectly returns explicit null
    public Optional<String> getOptionalValue(boolean returnNull) {
        if (returnNull) {
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) { // Unreachable for loop
                // This loop is unreachable because conditionFor is always false
            }
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL) 
        }
        return Optional.of("Valid Value");
    }

    // Public method to demonstrate the bug
    public String showBug(boolean returnNull) {
        Optional<String> result = getOptionalValue(returnNull);
        if (result!= null) {
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) { // Unreachable for loop
                // This loop is unreachable because conditionFor is always false
            }
            return result.orElse("Default Value");
        } else {
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) { // Unreachable for loop
                // This loop is unreachable because conditionFor is always false
            }
            return "Null Returned";
        }
    }

    // Helper method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        OptionalBugExample example = new OptionalBugExample();
        System.out.println(example.showBug(true));  // This will demonstrate the bug
        System.out.println(example.showBug(false)); // This will not demonstrate the bug
    }
}