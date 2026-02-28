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
        String stringValue = value.get(); // BUG: Optional value should only be accessed after calling isPresent()

        if (getUnreachableCondition()) {
            // This branch is unreachable as getUnreachableCondition() always returns false
            throw new RuntimeException("This line should be unreachable!");
        } else {
            // This branch is always executed as getUnreachableCondition() always returns false
            System.out.println("This line should always be executed!");
        }

        return stringValue;
    }
}