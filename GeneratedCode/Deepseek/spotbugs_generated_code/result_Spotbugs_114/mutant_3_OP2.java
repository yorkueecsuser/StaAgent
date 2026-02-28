class NaNChecker {
    public boolean showBug(double x) {
        if (x == Double.NaN) {
            x = x; // Mutation: Duplicate the assignment statement
            return true;
        }
        return false;
    }
}