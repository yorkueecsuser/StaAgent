import java.util.Random;

class BuggyCode {

    public boolean showBug(boolean input) {
        // Inserting a dead store variable
        int deadStore = new Random().nextInt();

        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (input = true) { // The '=' is a mistake, this should be '=='
            return true;
        }
        return false;
    }
}