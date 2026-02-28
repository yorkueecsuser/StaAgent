class BuggyCode {
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(Object obj) {
        // Unreachable if statement mutation
        if (getUnreachableCondition()) {
            System.out.println("This should never be printed.");
        }

        // Original bug
        return obj instanceof String;
    }
}