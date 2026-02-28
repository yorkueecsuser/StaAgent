import java.util.Optional;

class OptionalEqualityBug {

    public Boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        return opt1 == opt2; // BUG: OptionalEquality

        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable statement due to condition being false.");
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    public static void main(String[] args) {
        OptionalEqualityBug bugDemo = new OptionalEqualityBug();
        Optional<String> optional1 = Optional.of("Hello");
        Optional<String> optional2 = Optional.of("Hello");
        
        System.out.println(bugDemo.showBug(optional1, optional2)); // This will print false due to reference equality
    }
}