class BuggyCode {
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(Object obj) {
        // Original code
        boolean originalResult = obj instanceof String;

        // Mutated code: Inserting unreachable if branch
        if (getUnreachableCondition()) {
            return false; // This branch is always unreachable
        }

        return originalResult;
    }
}