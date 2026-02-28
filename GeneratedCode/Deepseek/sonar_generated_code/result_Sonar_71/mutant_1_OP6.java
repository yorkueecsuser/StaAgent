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

        // Mutation Operator: Unreachable for loop
        for (int i = 0; false; i++) {
            // unreachable code
        }

        if (methodThatReturnsOptional().isEmpty()) {
            throw new RuntimeException("NotFoundException");
        }
        String value2 = methodThatReturnsOptional().get(); // Noncompliant

        // Mutation Operator: Unreachable for loop
        for (int i = 0; false; i++) {
            // unreachable code
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}