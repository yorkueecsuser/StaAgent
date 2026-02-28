import java.util.Optional;
import java.util.NoSuchElementException;

class BugDemo {
    private Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug() {
        Optional<String> value = this.getOptionalValue();

        // Mutated code: Added unreachable while loop
        while (getUnreachableCondition()) {
            // This loop will never execute as the condition is always false
            System.out.println("This is an unreachable loop.");
        }

        String stringValue = value.get(); // BUG: Optional value should only be accessed after calling isPresent()
        return stringValue;
    }
}