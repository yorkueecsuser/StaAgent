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
        Optional<String> a = getOptionalValue(returnNull); // Renamed'result' to 'a'
        if (a!= null) {
            return a.orElse("Default Value");
        } else {
            return "Null Returned";
        }
    }

    public static void main(String[] args) {
        OptionalBugExample b = new OptionalBugExample(); // Renamed 'example' to 'b'
        System.out.println(b.showBug(true));  // This will demonstrate the bug
        System.out.println(b.showBug(false)); // This will not demonstrate the bug
    }
}