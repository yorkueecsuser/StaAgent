class ArrayBug {
    public Object showBug(int[] array) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code - This block will never execute as the condition is always false
            throw new RuntimeException("This line should never be reached");
        }
        return array.hashCode() + " " + array.toString();
    }

    private boolean getUnreachableCondition() {
        return false;  // Always returns false, making the if statement unreachable
    }
}