class NaNChecker {
    public boolean showBug(double x) {
        if (x == Double.NaN) {
            boolean condition = getCondition();
            for (int i = 0; condition; i++) { // Unreachable loop due to condition being always false
                System.out.println("This line will never be executed.");
            }
            return true;
        }
        return false;
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }
}