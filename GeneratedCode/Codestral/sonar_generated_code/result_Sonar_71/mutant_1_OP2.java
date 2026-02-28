import java.util.Optional;
import java.util.NoSuchElementException;

class BugDemo {
    private Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    public String showBug() {
        Optional<String> value = this.getOptionalValue();
        String stringValue = value.get(); // Original code
        String duplicateStringValue = stringValue; // Mutant code: Duplicated assignment statement
        return stringValue;
    }
}