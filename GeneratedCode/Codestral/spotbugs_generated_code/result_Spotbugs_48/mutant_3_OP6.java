class ArrayIndexOutOfBoundsBug {

    public Object showBug(Object[] array, int index) {
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            // Unreachable for loop added as per the mutation operator
            System.out.println("This loop is unreachable");
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

    // Add a method to return a false value dynamically
    private static boolean getCondition() {
        return false;
    }
}