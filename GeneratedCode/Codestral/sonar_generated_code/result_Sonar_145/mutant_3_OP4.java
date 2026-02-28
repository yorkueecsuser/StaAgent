class ArrayBug {
    public Object showBug(int[] array) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable branch
            throw new IllegalStateException("This code should be unreachable");
        }
        return array.hashCode() + " " + array.toString();
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the if branch unreachable
        return false;
    }
}