import java.util.Optional;

class OptionalEqualityBug {

    public Boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop");
        }
        
        return opt1 == opt2; // BUG: OptionalEquality
    }

    private boolean getCondition() {
        // This method returns false, making the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        OptionalEqualityBug bugDemo = new OptionalEqualityBug();
        Optional<String> optional1 = Optional.of("Hello");
        Optional<String> optional2 = Optional.of("Hello");
        
        System.out.println(bugDemo.showBug(optional1, optional2)); // This will print false due to reference equality
    }
}