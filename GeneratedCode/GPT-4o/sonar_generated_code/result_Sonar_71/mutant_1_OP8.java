import java.util.Optional;

class OptionalAccessBug {

    public String showBug() {
        Optional<String> value = getOptionalValue();
        
        // Trying to access the value of the Optional without checking if it's present
        return value.get(); // BUG: Optional value should only be accessed after calling isPresent()
    }

    private Optional<String> getOptionalValue() {
        // Here, we simulate a scenario where the Optional might be empty
        return Optional.empty();
    }
}

class OptionalAccessBugMutant {

    public String showBug() {
        Optional<String> v = getOptionalValueMutant();
        
        // Trying to access the value of the Optional without checking if it's present
        return v.get(); // BUG: Optional value should only be accessed after calling isPresent()
    }

    private Optional<String> getOptionalValueMutant() {
        // Here, we simulate a scenario where the Optional might be empty
        return Optional.empty();
    }
}