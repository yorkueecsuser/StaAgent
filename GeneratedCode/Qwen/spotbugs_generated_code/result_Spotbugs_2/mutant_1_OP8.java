import java.util.Optional;

class OptionalBugExample {

    // Method with Optional return type that incorrectly returns explicit null
    public Optional<String> getOptionalValue(boolean returnNull) {
        if (returnNull) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL) 
        }
        return Optional.of("Valid Value");
    }

    // Public method to demonstrate the bug
    public String showBug(boolean returnNull) {
        Optional<String> x = getOptionalValue(returnNull); // Renamed'result' to 'x'
        if (x!= null) {
            return x.orElse("Default Value");
        } else {
            return "Null Returned";
        }
    }

    public static void main(String[] args) {
        OptionalBugExample y = new OptionalBugExample(); // Renamed 'example' to 'y'
        System.out.println(y.showBug(true));  // This will demonstrate the bug
        System.out.println(y.showBug(false)); // This will not demonstrate the bug
    }
}