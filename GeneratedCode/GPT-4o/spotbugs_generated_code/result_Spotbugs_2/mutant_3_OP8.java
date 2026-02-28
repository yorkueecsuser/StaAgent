import java.util.Optional;

class OptionalBugDemo {

    // Method intentionally returns null despite having an Optional return type
    public Optional<String> getOptionalString(boolean x) { // Variable renamed from returnNull to x
        if (x) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }
        return Optional.of("Valid String");
    }

    // Method to demonstrate the bug
    public Optional<String> showBug(boolean y) { // Variable renamed from returnNull to y
        return getOptionalString(y);
    }

    public static void main(String[] args) {
        OptionalBugDemo z = new OptionalBugDemo(); // Variable renamed from demo to z
        
        // Demonstrating the bug
        Optional<String> result = z.showBug(true);
        if (result == null) {
            System.out.println("Bug encountered: Optional<String> returned as null.");
        } else {
            result.ifPresent(System.out::println);
        }
    }
}