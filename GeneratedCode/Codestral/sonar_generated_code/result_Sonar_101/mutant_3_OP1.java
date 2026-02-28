class UnreachableCodeBug {
    public int showBug(boolean a, boolean b) {
        int result = 0;
        int deadStore = 10; // dead store added

        if (!a || b) {
            result = 1;
        } else {
            result = 2; // never executed
        }
        return result;
    }
}