import java.util.Optional;
import java.util.NoSuchElementException;

class BugDemo {
    private boolean getUnreachableCondition() {
        return false;
    }

    private Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    public String showBug() {
        Optional<String> value = this.getOptionalValue();
        while (getUnreachableCondition()) {
            // Unreachable code block
            int x = 10;
            x++;
        }
        String stringValue = value.get(); // BUG: Optional value should only be accessed after calling isPresent()
        return stringValue;
    }
}