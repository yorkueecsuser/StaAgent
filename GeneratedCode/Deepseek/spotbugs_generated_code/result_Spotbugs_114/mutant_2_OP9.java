class NaNChecker {
    public boolean showBug(double x) {
        // Mutant: Equivalent buggy test for NaN
        if (Double.isNaN(x)) { // Equivalent buggy condition to x == Double.NaN
            return true;
        }
        return false;
    }
}