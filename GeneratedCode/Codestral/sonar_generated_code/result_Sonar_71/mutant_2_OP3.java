import java.util.Optional;
import java.util.NoSuchElementException;

class BugDemo {
    private Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    private boolean getFalseCondition() {
        return false;  // This method always returns false
    }

    public String showBug() {
        Optional<String> value = this.getOptionalValue();

        if (getFalseCondition()) {  // Unreachable if statement
            throw new IllegalStateException("Unreachable code executed");
        }

        String stringValue = value.get(); // BUG: Optional value should only be accessed after calling isPresent()
        return stringValue;
    }
}