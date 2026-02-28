class ArrayIndexOutOfBoundsBug {

    public Object showBug(Object[] array, int index) {
        // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
        Object result = array[index];
        Object duplicateResult = array[index];  // Mutant: Duplicated assignment
        return result;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        Object[] array = new Object[3];
        Object result = bug.showBug(array, 5);
        System.out.println(result);
    }
}