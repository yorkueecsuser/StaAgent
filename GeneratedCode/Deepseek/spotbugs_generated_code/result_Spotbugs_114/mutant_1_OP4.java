class NaNChecker {
    public boolean showBug(double x) {
        boolean unreachableCondition = falseMethod();
        if (unreachableCondition) {
            // Unreachable code
            if (x == Double.NaN) {
                return true;
            }
        }
        if (x == Double.NaN) {
            return true;
        }
        return false;
    }

    private boolean falseMethod() {
        return false;
    }
}