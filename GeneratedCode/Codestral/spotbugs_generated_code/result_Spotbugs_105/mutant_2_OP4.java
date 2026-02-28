class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
        // Insert unreachable if-else statement
        boolean isUnreachable = getCondition();
        if (isUnreachable) {
            // This is an unreachable block of code
            System.out.println("Unreachable code block");
        } else {
            // The original buggy code remains
            return array1.equals(array2);
        }
    }
    // Method to simulate a dynamic condition
    private boolean getCondition() {
        return Math.random() < 0.0; // This will always return false
    }
}