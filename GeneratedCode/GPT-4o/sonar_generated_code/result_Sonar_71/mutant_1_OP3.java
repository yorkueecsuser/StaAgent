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

    // Unreachable if statement added as a mutation
    public void unreachableIfBranch() {
        boolean alwaysFalse = isConditionTrue();
        if (alwaysFalse) {
            System.out.println("This code is unreachable");
        }
    }

    // This method simulates a condition that is always false
    private boolean isConditionTrue() {
        return false;
    }
}