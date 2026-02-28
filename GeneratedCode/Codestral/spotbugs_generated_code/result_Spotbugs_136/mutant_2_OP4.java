class BuggyCode {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(boolean input) {
        // Original bug
        if (input = true) {
            return true;
        }

        // Mutated code: Unreachable if-else branch
        boolean shouldRun = getFalseCondition();
        if (shouldRun) {
            System.out.println("This line should never be executed");
        } else {
            System.out.println("This is the else branch of the unreachable branch");
        }

        return false;
    }
}