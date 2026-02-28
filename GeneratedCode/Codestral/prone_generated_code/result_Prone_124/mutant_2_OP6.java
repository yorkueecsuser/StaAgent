import java.util.Optional;

class OptionalEqualityBug {
    public boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Mutant: Unreachable for loop inserted
            System.out.println("This loop is unreachable");
            break; // To avoid infinite loop
        }
        return opt1 == opt2; // Original code
    }

    private boolean getCondition() {
        return false; // Always returns false, making the loop unreachable
    }
}