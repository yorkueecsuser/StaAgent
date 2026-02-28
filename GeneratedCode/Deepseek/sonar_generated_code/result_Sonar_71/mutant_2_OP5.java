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
        
        // Mutation Operator: Unreachable Switch Statement
        int mutantSwitchValue = getMutantSwitchValue();
        switch (mutantSwitchValue) {
            case 1:
                System.out.println("This code is unreachable due to the mutation operator.");
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }

    // New method added to avoid compile-time constants
    public int getMutantSwitchValue() {
        return 0;
    }
}