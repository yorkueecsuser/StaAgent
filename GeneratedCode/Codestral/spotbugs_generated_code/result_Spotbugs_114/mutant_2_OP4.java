class NaNChecker {
    public boolean showBug(double x) {
        if (x == Double.NaN) {
            return true;
        }
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This is an unreachable if-else branch
            return false;
        }
        return false;
    }
}