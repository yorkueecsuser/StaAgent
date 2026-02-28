import java.util.Random;

class BuggyCode {

    public boolean showBug(boolean input) {
        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        // Mutant code added based on Dead Store mutation operator
        boolean deadStore = getRandomBoolean();
        if (input = true) { // The '=' is a mistake, this should be '=='
            return true;
        }
        return false;
    }

    // Method to generate a random boolean value
    private boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}