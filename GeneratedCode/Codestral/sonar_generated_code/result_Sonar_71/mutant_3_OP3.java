import java.util.Optional;
import java.util.NoSuchElementException;

class BugDemo {
    private Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    // Additional method to return a dynamically determined condition for unreachable if statement
    private boolean getCondition() {
        return false;
    }

    public String showBug() {
        Optional<String> value = this.getOptionalValue();
        String stringValue = value.get();

        // Mutant: Inserted unreachable if statement
        if (getCondition()) {
            // This code is unreachable as getCondition() always returns false
            throw new UnreachableException("This code is unreachable.");
        }

        return stringValue;
    }
}

class UnreachableException extends RuntimeException {
    public UnreachableException(String message) {
        super(message);
    }
}