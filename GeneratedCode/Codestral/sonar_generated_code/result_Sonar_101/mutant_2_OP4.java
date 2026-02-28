class UnreachableCodeBug {
    public int showBug(boolean a, boolean b) {
        int result = 0;
        if (!a || b) { // Noncompliant; "!a" is always "true", "b" is never evaluated
            result = 1;
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) { // Unreachable branch
                result = 3;
            } else {
                result = 4; // Unreachable branch
            }
        } else {
            result = 2; // never executed
        }
        return result;
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}