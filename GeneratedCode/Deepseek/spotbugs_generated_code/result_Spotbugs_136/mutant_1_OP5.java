class BuggyCode {

    public boolean showBug(boolean input) {
        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (input = true) { // The '=' is a mistake, this should be '=='
            // Mutant: Unreachable switch statement
            int value = getValue(); // Assuming that getValue() is a method that returns an integer
            switch (value) {
                case 1:
                    // Unreachable code
                    System.out.println("Unreachable code executed");
                    break;
                default:
                    break;
            }
            return true;
        }
        return false;
    }

    // Assuming that this method is defined elsewhere in the code
    private int getValue() {
        return 0; // This value ensures that the switch statement is unreachable
    }
}