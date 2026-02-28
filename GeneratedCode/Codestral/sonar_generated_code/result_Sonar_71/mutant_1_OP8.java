import java.util.Optional;
import java.util.NoSuchElementException;

class BugDemo {
    private Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    public String showBug() {
        Optional<String> optValue = this.getOptionalValue(); // Renaming value to optValue
        String stringOptValue = optValue.get(); // BUG: Optional value should only be accessed after calling isPresent()
        return stringOptValue;
    }
}