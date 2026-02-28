class ArrayIndexOutOfBoundsBug {

    public Object showBug(Object[] array, int index) {
        // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
        Object element = array[index]; // Original assignment statement
        Object duplicateElement = array[index]; // Duplicated assignment statement
        return element;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        Object[] array = new Object[3];
        Object result = bug.showBug(array, 5);
        System.out.println(result);
    }
}