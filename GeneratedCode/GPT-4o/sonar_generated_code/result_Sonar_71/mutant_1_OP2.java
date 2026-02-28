import java.util.Optional;

class OptionalAccessBug {

    public String showBug() {
        Optional<String> value = getOptionalValue();
        
        // Original assignment statement
        Optional<String> duplicateValue = value;
        Optional<String> duplicateValue2 = value;

        // Trying to access the value of the Optional without checking if it's present
        return value.get(); // BUG: Optional value should only be accessed after calling isPresent()
    }

    private Optional<String> getOptionalValue() {
        // Here, we simulate a scenario where the Optional might be empty
        return Optional.empty();
    }
}