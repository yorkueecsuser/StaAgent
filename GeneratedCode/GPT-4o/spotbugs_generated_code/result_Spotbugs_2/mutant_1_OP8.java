import java.util.Optional;

class OptionalBugDemo {

    // Method intentionally returns null despite having an Optional return type
    public Optional<String> getOptionalString(boolean r) { // Renamed 'returnNull' to 'r'
        if (r) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }
        return Optional.of("Valid String");
    }

    // Method to demonstrate the bug
    public Optional<String> showBug(boolean r) { // Renamed 'returnNull' to 'r'
        return getOptionalString(r);
    }

    public static void main(String[] args) {
        OptionalBugDemo d = new OptionalBugDemo(); // Renamed 'demo' to 'd'
        
        // Demonstrating the bug
        Optional<String> res = d.showBug(true); // Renamed 'result' to 'res'
        if (res == null) {
            System.out.println("Bug encountered: Optional<String> returned as null.");
        } else {
            res.ifPresent(System.out::println);
        }
    }
}