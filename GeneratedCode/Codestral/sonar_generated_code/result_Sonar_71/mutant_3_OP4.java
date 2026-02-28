import java.util.Optional;
import java.util.NoSuchElementException;

class BugDemo {
    private Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    public String showBug() {
        Optional<String> value = this.getOptionalValue();
        String stringValue = value.get(); // BUG: Optional value should only be accessed after calling isPresent()

        // Mutated code using Unreachable if-else statement mutation operator
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            throw new IllegalStateException("Unreachable branch executed");
        } else {
            // Alternative code that is reachable
            // Since the condition is always false, this branch will never be executed
            System.out.println("This branch is unreachable.");
        }

        return stringValue;
    }
}