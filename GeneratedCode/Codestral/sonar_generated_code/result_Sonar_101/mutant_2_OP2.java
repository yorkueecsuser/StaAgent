class UnreachableCodeBug {
    public int showBug(boolean a, boolean b) {
        int result = 0;
        if (!a || b) {
            result = 1;
            result = 1; // Inserted mutant code
        } else {
            result = 2;
        }
        return result;
    }
}