class ArrayIndexOutOfBoundsBug {

    public Object showBug(Object[] array, int index) {
        int value = getValue();
        switch(value) {
            case 1:
                throw new IllegalStateException("Unreachable code in mutant");
            default:
                break;
        }
        // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
        return array[index];
    }

    private int getValue() {
        return 0; // This method ensures that the switch condition is always false
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        Object[] array = new Object[3];
        Object result = bug.showBug(array, 5);
        System.out.println(result);
    }
}