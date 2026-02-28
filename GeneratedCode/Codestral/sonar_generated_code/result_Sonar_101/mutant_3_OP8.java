class UnreachableCodeBug {
    public int showBug(boolean a, boolean b) {
        int result = 0;
        boolean c = b; // Renamed 'b' to 'c'
        if (!a || c) { // Noncompliant; "!a" is always "true", "c" is never evaluated
            result = 1;
        } else {
            result = 2; // never executed
        }
        return result;
    }
}