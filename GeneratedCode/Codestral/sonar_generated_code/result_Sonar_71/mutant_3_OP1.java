import java.util.Optional;
import java.util.NoSuchElementException;

class BugDemo {
    private Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    public String showBug() {
        // Added dead store mutant
        String deadStoreVariable = "deadstore";

        Optional<String> value = this.getOptionalValue();
        String stringValue = value.get(); // BUG: Optional value should only be accessed after calling isPresent()
        return stringValue;
    }
}