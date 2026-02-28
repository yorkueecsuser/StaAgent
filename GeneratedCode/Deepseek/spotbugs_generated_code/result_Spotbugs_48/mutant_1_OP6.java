class ArrayIndexOutOfBoundsBug {

    public Object showBug(Object[] array, int index) {
        // Adding unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable code");
        }

        // Original bug: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
        return array[index];
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        Object[] array = new Object[3];
        Object result = bug.showBug(array, 5);
        System.out.println(result);
    }
}