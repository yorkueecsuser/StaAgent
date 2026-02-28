class ArrayIndexOutOfBoundsBug {

    private boolean getFalseCondition() {
        return false;
    }

    public Object showBug(Object[] array, int index) {
        // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
        if (getFalseCondition()) {
            // Unreachable if statement
            return null;
        }
        return array[index];
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        Object[] array = new Object[3];
        Object result = bug.showBug(array, 5);
        System.out.println(result);
    }
}