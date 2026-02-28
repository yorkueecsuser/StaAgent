class NaNChecker {
    public boolean showBug(double x) {
        if (x == Double.NaN) {
            return true;
        }
        if (getFalseCondition()) { // Unreachable if statement
            System.out.println("This code is unreachable!");
        }
        return false;
    }

    private boolean getFalseCondition() {
        return false;
    }
}