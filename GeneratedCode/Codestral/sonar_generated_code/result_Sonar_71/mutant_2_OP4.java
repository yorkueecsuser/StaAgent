import java.util.Optional;
import java.util.NoSuchElementException;

class BugDemo {
    private Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    private boolean getUnreachableCondition() {
        return false; // Always false to make this condition unreachable
    }

    public String showBug() {
        Optional<String> value = this.getOptionalValue();
        String stringValue = value.get();

        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code block
            throw new IllegalStateException("This code should be unreachable!");
        } else {
            // Original code continues
            return stringValue;
        }
    }
}