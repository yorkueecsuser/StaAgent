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

    public void demonstrateUnreachableSwitch() {
        int switchCondition = getSwitchCondition(); // dynamically determine condition
        switch (switchCondition) {
            case 1:
                System.out.println("This will never be executed.");
                break;
            case 2:
                System.out.println("This still won't be executed.");
                break;
            default:
                System.out.println("Default case: unreachable switch demonstration.");
                break;
        }
    }

    private int getSwitchCondition() {
        // Returning a value that doesn't match any case to keep the switch statement unreachable
        return 0;
    }
}