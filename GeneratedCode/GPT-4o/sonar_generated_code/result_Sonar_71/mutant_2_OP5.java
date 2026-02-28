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

    // Introduce an unreachable switch statement
    public void unreachableSwitch() {
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This will never be executed.");
                break;
            case 2:
                System.out.println("This will never be executed either.");
                break;
            default:
                // The default case will be executed because unreachableCondition is always 0
                System.out.println("Default case executed.");
                break;
        }
    }

    private int getUnreachableCondition() {
        // This method returns a constant value to simulate an unreachable switch statement
        return 0; // This makes other cases unreachable
    }
}