class ArrayIndexOutOfBoundsBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public Object showBug(Object[] array, int index) {
        // Unreachable if statement mutation
        if (getUnreachableCondition()) {
            System.out.println("This line should never be executed.");
        }

        // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
        return array[index];
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        Object[] array = new Object[3];
        Object result = bug.showBug(array, 5);
        System.out.println(result);
    }
}