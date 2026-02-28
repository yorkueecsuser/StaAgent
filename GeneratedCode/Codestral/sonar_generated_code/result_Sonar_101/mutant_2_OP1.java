class UnreachableCodeBug {
    public int showBug(boolean a, boolean b) {
        int result = 0;
        int deadStoreVar = 10; // Dead store mutation
        if (!a || b) { // Noncompliant; "!a" is always "true", "b" is never evaluated
            result = 1;
        } else {
            result = 2; // never executed
        }
        return result;
    }
}