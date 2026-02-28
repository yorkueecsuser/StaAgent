import java.util.Optional;

class OptionalEqualityBug {

    public Boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        return opt1 == opt2; // BUG: OptionalEquality

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
            System.out.println("This loop should never execute.");
        }
    }

    private boolean getCondition() {
        // This method returns false, making the loop condition always false
        return false;
    }

    public static void main(String[] args) {
        OptionalEqualityBug bugDemo = new OptionalEqualityBug();
        Optional<String> optional1 = Optional.of("Hello");
        Optional<String> optional2 = Optional.of("Hello");
        
        System.out.println(bugDemo.showBug(optional1, optional2)); // This will print false due to reference equality
    }
}