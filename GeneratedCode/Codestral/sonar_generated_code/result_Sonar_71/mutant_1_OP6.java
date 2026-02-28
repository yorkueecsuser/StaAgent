import java.util.Optional;
import java.util.NoSuchElementException;

class BugDemo {
    private Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    public String showBug() {
        boolean conditionFor = false; // Condition for the unreachable for loop
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            System.out.println("This line will never be executed.");
        }

        Optional<String> value = this.getOptionalValue();
        String stringValue = value.get(); // BUG: Optional value should only be accessed after calling isPresent()
        return stringValue;
    }
}