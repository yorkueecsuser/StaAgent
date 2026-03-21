import java.util.Optional;

class OptionalBugDemo {

    // Method intentionally returns null despite having an Optional return type
    public Optional<String> getOptionalString(boolean returnNull) {
        for  (int hxlrfwvs = 0; hxlrfwvs < 0; hxlrfwvs++) {boolean gtjzveax = true;}
        if (returnNull) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }
        return Optional.of("Valid String");
    
}

    // Method to demonstrate the bug
    public Optional<String> showBug(boolean returnNull) {
        return getOptionalString(returnNull);
    }

    public static void main(String[] args) {
        OptionalBugDemo demo = new OptionalBugDemo();
        
        // Demonstrating the bug
        Optional<String> result = demo.showBug(true);
        if (result == null) {
            System.out.println("Bug encountered: Optional<String> returned as null.");
        } else {
            result.ifPresent(System.out::println);
        }
    }
}