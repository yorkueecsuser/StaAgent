class UnreachableCodeBug {
    private boolean getUnreachableCondition() {
        // This method always returns false
        return false;
    }

    public int showBug(boolean a, boolean b) {
        int result = 0;
        if (!a || b) {
            result = 1;
        } else {
            result = 2;
        }

        // Inserting unreachable if branch
        if (getUnreachableCondition()) {
            result = 3; // This result will never be assigned
        }

        return result;
    }
}