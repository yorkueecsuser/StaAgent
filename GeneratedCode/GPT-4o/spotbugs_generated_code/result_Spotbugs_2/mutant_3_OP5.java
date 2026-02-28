import java.util.Optional;

class OptionalBugDemo {

    // Method intentionally returns null despite having an Optional return type
    public Optional<String> getOptionalString(boolean returnNull) {
        if (returnNull) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }
        return Optional.of("Valid String");
    }
    
    // Adding an unreachable switch statement
    public void unreachableSwitchExample() {
        int condition = getUnreachableCondition();
        switch(condition) {
            case 1:
                System.out.println("This code is unreachable because the condition is never 1.");
                break;
            default:
                // No action needed
                break;
        }
    }
    
    // Method to ensure the switch case remains unreachable
    private int getUnreachableCondition() {
        return 0; // Always returns 0, ensuring the case 1 is never executed
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
        
        // Demonstrate unreachable switch
        demo.unreachableSwitchExample();
    }
}