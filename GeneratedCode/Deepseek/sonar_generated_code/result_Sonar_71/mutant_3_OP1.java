import java.util.Optional;

class BugExample {
    Optional<String> getOptionalValue() {
        String deadStore1 = ""; // non-compliant
        return Optional.empty();
    }

    Optional<String> methodThatReturnsOptional() {
        String deadStore2 = ""; // non-compliant
        return Optional.empty();
    }

    public void showBug() {
        Optional<String> value = this.getOptionalValue();
        String stringValue = value.get(); // Noncompliant

        if (methodThatReturnsOptional().isEmpty()) {
            throw new RuntimeException("NotFoundException");
        }
        String value2 = methodThatReturnsOptional().get(); // Noncompliant
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}