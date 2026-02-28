class ArrayIndexOutOfBoundsBug {

    private boolean getCondition() {
        return false;
    }

    public Object showBug(Object[] array, int index) {
        if (getCondition()) {
            // Unreachable if-else statement
            System.out.println("This code is unreachable");
        } else {
            // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
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