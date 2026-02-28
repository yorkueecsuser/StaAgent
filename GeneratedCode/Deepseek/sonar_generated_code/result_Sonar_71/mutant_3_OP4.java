import java.util.Optional;

class BugExample {
    Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    Optional<String> methodThatReturnsOptional() {
        return Optional.empty();
    }

    public void showBug() {
        Optional<String> value = this.getOptionalValue();
        String stringValue = value.get(); // Noncompliant

        if (methodThatReturnsOptional().isEmpty()) {
            throw new RuntimeException("NotFoundException");
        }
        String value2 = methodThatReturnsOptional().get(); // Noncompliant
        
        // Unreachable if-else statement mutation
        if (false) {
            // Unreachable code branch
            System.out.println("This code will never be executed");
        } else {
            // Reachable code branch
            System.out.println("This code will always be executed");
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}