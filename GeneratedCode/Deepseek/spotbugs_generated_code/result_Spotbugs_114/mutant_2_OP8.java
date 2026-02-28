class NaNChecker {
    public boolean showBug(double y) {
        if (y == Double.NaN) { // Original code remains unchanged
            return true;
        }
        double z = 1.0; // New variable introduced for mutation
        if (z == Double.NaN) { // Mutant code
            return true;
        }
        return false;
    }
}