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

        // Mutant Code: Duplicated assignment statement
        String stringValue2 = value.get(); // Noncompliant
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}