class ArrayIndexOutOfBoundsBug {

    public Object showBug(Object[] array, int index) {
        // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
        // MUTATION: Increase the index value by 1
        return array[index + 1];
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        Object[] array = new Object[3];
        Object result = bug.showBug(array, 4); // Changed index from 5 to 4 to still cause an out-of-bounds error
        System.out.println(result);
    }
}