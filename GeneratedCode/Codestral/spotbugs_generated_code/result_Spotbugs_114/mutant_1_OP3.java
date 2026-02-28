class NaNChecker {
    public boolean showBug(double x) {
        if (x == Double.NaN) { // original bug
            return true;
        }
        boolean unreachableCondition = false; // dynamically determined unreachable condition
        if (unreachableCondition) { // unreachable if statement
            System.out.println("This line is unreachable.");
        }
        return false;
    }
}