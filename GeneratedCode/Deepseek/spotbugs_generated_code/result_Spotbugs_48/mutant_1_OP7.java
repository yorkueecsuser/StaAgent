class ArrayIndexOutOfBoundsBug {

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }

    public Object showBug(Object[] array, int index) {
        // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
        while (getCondition()) {
            // Unreachable while loop
            System.out.println("This statement will never be printed");
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