import java.util.Optional;
import java.util.NoSuchElementException;

class BugDemo {
    private Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    public String showBug() {
        Optional<String> value = this.getOptionalValue();
        String stringValue = value.get(); // BUG: Optional value should only be accessed after calling isPresent()

        // Mutant code: Dead Store
        String deadStoreValue = "abcdefgh"; // This is a dead store as it is not used in the code

        return stringValue;
    }
}