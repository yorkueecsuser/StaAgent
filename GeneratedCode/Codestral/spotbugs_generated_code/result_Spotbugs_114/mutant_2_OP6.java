class NaNChecker {
    public boolean showBug(double x) {
        // Original buggy code
        if (x == Double.NaN) {
            return true;
        }

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable code");
        }

        return false;
    }

    // Placeholder method, replace with actual implementation
    private boolean getCondition() {
        return false;
    }
}