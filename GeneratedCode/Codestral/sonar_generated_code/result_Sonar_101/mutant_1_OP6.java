class UnreachableCodeBug {
    public int showBug(boolean a, boolean b) {
        int result = 0;
        boolean alwaysFalse = getAlwaysFalse();
        for (int i = 0; alwaysFalse; i++) { // Unreachable for loop
            result = 3;
        }
        if (!a || b) { // Noncompliant; "!a" is always "true", "b" is never evaluated
            result = 1;
        } else {
            result = 2; // never executed
        }
        return result;
    }

    private boolean getAlwaysFalse() {
        return false;
    }
}