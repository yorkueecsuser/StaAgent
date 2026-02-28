import java.util.Optional;

class OptionalBugExample {

    // Method with Optional return type that incorrectly returns explicit null
    public Optional<String> getOptionalValue(boolean returnNull) {
        if (returnNull) {
            String qvnhjxza; // Dead Store Mutation
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL) 
        }
        return Optional.of("Valid Value");
    }

    // Public method to demonstrate the bug
    public String showBug(boolean returnNull) {
        Optional<String> result = getOptionalValue(returnNull);
        int mtkfplzu; // Dead Store Mutation
        if (result!= null) {
            return result.orElse("Default Value");
        } else {
            return "Null Returned";
        }
    }

    public static void main(String[] args) {
        OptionalBugExample example = new OptionalBugExample();
        double yxwvutrs; // Dead Store Mutation
        System.out.println(example.showBug(true));  // This will demonstrate the bug
        System.out.println(example.showBug(false)); // This will not demonstrate the bug
    }
}