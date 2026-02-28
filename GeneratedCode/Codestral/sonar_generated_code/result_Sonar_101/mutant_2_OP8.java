class UnreachableCodeBug {
    public int showBug(boolean a, boolean b) {
        int result = 0;
        boolean c = b; // New variable created for renaming
        if (!a || c) {
            result = 1;
        } else {
            result = 2;
        }
        return result;
    }
}