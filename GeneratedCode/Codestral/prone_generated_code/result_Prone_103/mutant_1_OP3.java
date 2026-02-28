class LossyPrimitiveCompareBug {
    public int showBug() {
        // Original code
        int result = Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);

        // Mutant code: Unreachable if statement
        boolean alwaysFalse = getAlwaysFalseCondition();
        if (alwaysFalse) {
            // This code is unreachable
            System.out.println("This line should never be executed");
        }

        return result;
    }

    // Method to return a condition that is always false
    private boolean getAlwaysFalseCondition() {
        return false;
    }
}