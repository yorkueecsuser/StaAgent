import java.util.Optional;

class OptionalEqualityBug {

    public Boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        return opt1 == opt2; // BUG: OptionalEquality

        // Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Code that should never run
            System.out.println("This is an unreachable if block.");
        } else {
            // Alternative code that should also never run
            System.out.println("This is an unreachable else block.");
        }
    }

    private boolean getCondition() {
        // This method returns a condition that is always false
        return false;
    }

    public static void main(String[] args) {
        OptionalEqualityBug bugDemo = new OptionalEqualityBug();
        Optional<String> optional1 = Optional.of("Hello");
        Optional<String> optional2 = Optional.of("Hello");
        
        System.out.println(bugDemo.showBug(optional1, optional2)); // This will print false due to reference equality
    }
}