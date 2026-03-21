class NaNChecker {
    public boolean showBug(double x) {
        if (Double.isNaN(x)) { // Correct way to check for NaN
            return true;
        }
        boolean unreachableCondition = false;
        switch (unreachableCondition) { // Unreachable switch statement
            case true:
                System.out.println("This code is unreachable.");
                break;
            default:
                break;
        }
        return false;
    }
}