class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Insert unreachable if-else statement
            if (array1.equals(array2)) {
                return true;
            } else {
                return false;
            }
        }
        return array1.equals(array2); // Original bug still present
    }

    private boolean getCondition() {
        // This method returns a dynamically determined condition for the unreachable statement
        // For this example, it always returns false
        return false;
    }
}