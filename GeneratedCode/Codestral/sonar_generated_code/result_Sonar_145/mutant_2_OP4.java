class ArrayBug {
    private boolean getFalseCondition() {
        return false;
    }

    public Object showBug(int[] array) {
        boolean condition = getFalseCondition();
        if (condition) {
            // This branch is unreachable as the condition is always false
            throw new RuntimeException("Unreachable code executed");
        } else {
            return array.hashCode() + " " + array.toString();
        }
    }
}