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

    // A method to generate a value that will always result in the default case being executed
    private int getUnreachableSwitchValue() {
        return 0; // This value will not match any case in the switch statement
    }
    
    public void demonstrateUnreachableSwitch() {
        int unreachableValue = getUnreachableSwitchValue();
        switch(unreachableValue) {
            case 1:
                System.out.println("This is case 1");
                break;
            case 2:
                System.out.println("This is case 2");
                break;
            default:
                System.out.println("Reached default case");
                break;
        }
    }
}