class ArrayIndexOutOfBoundsBug {

    private boolean getCondition() {
        return false;
    }

    public Object showBug(Object[] array, int index) {
        // Inserting unreachable for loop
        for (int i = 0; getCondition(); i++) {
            System.out.println("Unreachable code");
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