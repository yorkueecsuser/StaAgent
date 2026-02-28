import java.util.Optional;

class OptionalBugExample {

    // Method with Optional return type that incorrectly returns explicit null
    public Optional<String> getOptionalValue(boolean returnNull) {
        if (returnNull) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL) 
            return null; // DUPLICATION: Duplicate of the return null statement
        }
        return Optional.of("Valid Value");
        return Optional.of("Valid Value"); // DUPLICATION: Duplicate of the return Optional.of("Valid Value") statement
    }

    // Public method to demonstrate the bug
    public String showBug(boolean returnNull) {
        Optional<String> result = getOptionalValue(returnNull);
        Optional<String> result = getOptionalValue(returnNull); // DUPLICATION: Duplicate of the result assignment statement
        if (result!= null) {
            return result.orElse("Default Value");
        } else {
            return "Null Returned";
        }
    }

    public static void main(String[] args) {
        OptionalBugExample example = new OptionalBugExample();
        OptionalBugExample example = new OptionalBugExample(); // DUPLICATION: Duplicate of the example assignment statement
        System.out.println(example.showBug(true));  // This will demonstrate the bug
        System.out.println(example.showBug(false)); // This will not demonstrate the bug
    }
}