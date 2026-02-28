class ArrayIndexOutOfBoundsBug {

    private boolean getFalseCondition() {
        return false;
    }

    public Object showBug(Object[] array, int index) {
        // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
        if(getFalseCondition()) {
            // Unreachable if-else statement mutation
            return "This line is unreachable";
        } else {
            return array[index];
        }
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        Object[] array = new Object[3];
        Object result = bug.showBug(array, 5);
        System.out.println(result);
    }
}