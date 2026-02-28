class UnreachableCodeBug {
    public int showBug(boolean a, boolean b) {
        int result = 0;
        if (!a || b) {
            result = 1;
            result = result; // Mutant: Duplicated assignment
        } else {
            result = 2;
        }
        return result;
    }
}