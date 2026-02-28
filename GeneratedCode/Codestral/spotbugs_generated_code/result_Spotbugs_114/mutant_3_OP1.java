class NaNChecker {
    public boolean showBug(double x) {
        int deadStore; // Mutation: Dead Store
        if (x == Double.NaN) { // Original bug: FE: Doomed test for equality to NaN
            return true;
        }
        return false;
    }
}