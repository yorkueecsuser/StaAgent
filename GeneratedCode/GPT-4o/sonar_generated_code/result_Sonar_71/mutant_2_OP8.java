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

// Renamed variable in a new method to demonstrate mutation
class OptionalAccessBugMutant {

    public String showBugMutant() {
        Optional<String> x = getOptionalValueMutant();
        
        // Trying to access the value of the Optional without checking if it's present
        return x.get(); // BUG: Optional value should only be accessed after calling isPresent()
    }

    private Optional<String> getOptionalValueMutant() {
        // Here, we simulate a scenario where the Optional might be empty
        return Optional.empty();
    }
}