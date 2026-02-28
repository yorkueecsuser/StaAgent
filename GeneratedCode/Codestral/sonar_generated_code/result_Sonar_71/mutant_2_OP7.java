import java.util.Optional;
import java.util.NoSuchElementException;

class BugDemo {
    private boolean getFalseCondition() {
        return false;
    }

    private Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    public String showBug() {
        // Added unreachable while loop
        while (this.getFalseCondition()) {
            // This code will never be executed
            System.out.println("This is an unreachable statement");
        }

        Optional<String> value = this.getOptionalValue();
        String stringValue = value.get(); // BUG: Optional value should only be accessed after calling isPresent()
        return stringValue;
    }
}