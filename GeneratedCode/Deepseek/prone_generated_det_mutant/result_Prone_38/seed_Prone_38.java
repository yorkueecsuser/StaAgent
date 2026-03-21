class DuplicateBranches {
    public boolean showBug(boolean condition) {
        // BUG: DuplicateBranches
        if (condition) {
            return true;
        } else {
            return true;
        }
    }
}