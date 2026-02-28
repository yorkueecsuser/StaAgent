class UnreachableCodeBug {
    private boolean getFalseCondition() {
        return false;  // method to return false
    }

    public int showBug(boolean a, boolean b) {
        int result = 0;
        if (!a || b) {
            result = 1;
        } else {
            result = 2; // never executed
        }

        boolean shouldRun = getFalseCondition();
        if (shouldRun) { // new mutant code
            // this branch is unreachable, as shouldRun is always false
            result = 3;
        } else {
            result = 4;
        }

        return result;
    }
}