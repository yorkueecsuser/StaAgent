class BuggyCode {

    public boolean showBug(boolean input) {
        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (input = true) { // The '=' is a mistake, this should be '=='
            return true;
        }

        // Mutant code: Inserting unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never execute");
        }

        return false;
    }
}