import java.util.Optional;
import java.util.NoSuchElementException;

class BugDemo {
    private Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    public String showBug() {
        Optional<String> value = this.getOptionalValue();
        String stringValue = value.get(); // BUG: Original code

        Optional<String> a = this.getOptionalValue(); // Mutant code: Renaming 'value' to 'a'
        String b = a.get(); // Mutant code: Renaming'stringValue' to 'b'

        return stringValue;
    }
}