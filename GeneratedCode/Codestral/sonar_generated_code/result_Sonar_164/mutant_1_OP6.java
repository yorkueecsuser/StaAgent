class FloatingPointEqualityBug {
    public boolean showBug(float myNumber) {
        // Inserted unreachable for loop
        for (int i = 0; isFalseCondition(); i++) {
            System.out.println("This line should not be executed.");
        }

        // Original code
        if (myNumber == 3.146f) {
            return true;
        }
        return false;
    }

    private boolean isFalseCondition() {
        return false;
    }
}