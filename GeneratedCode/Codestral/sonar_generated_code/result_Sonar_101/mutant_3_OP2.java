class UnreachableCodeBug {
    public int showBug(boolean a, boolean b) {
        int result = 0;
        if (!a || b) {
            result = 1;
            result = 1; // Mutant code: Duplicated line
        } else {
            result = 2; // This line remains unreachable
        }
        return result;
    }
}