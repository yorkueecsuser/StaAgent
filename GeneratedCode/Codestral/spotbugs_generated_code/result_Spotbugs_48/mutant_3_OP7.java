class ArrayIndexOutOfBoundsBug {

    public Object showBug(Object[] array, int index) {
        // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
        Object result = array[index];

        // Mutated code: Unreachable while loop
        while (isFalse()) {
            System.out.println("This line should never be executed.");
        }

        return result;
    }

    private boolean isFalse() {
        return false;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        Object[] array = new Object[3];
        Object result = bug.showBug(array, 5);
        System.out.println(result);
    }
}