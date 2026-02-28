import java.util.Optional;
import java.util.NoSuchElementException;

class BugDemo {
    private Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    private boolean getCondition() {
        // This method always returns false to make the unreachable if branch unreachable
        return false;
    }

    public String showBug() {
        Optional<String> value = this.getOptionalValue();
        String stringValue = value.get();

        // Mutant: Inserting unreachable if branch
        if (getCondition()) {
            // This code will never be executed
            throw new IllegalStateException("Unreachable code was executed");
        }

        return stringValue;
    }
}