class ArrayIndexOutOfBoundsBug {
    public int showBug(int index, int[] array) {
        // Original code
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else statement
            if (index < 0) {
                System.out.println("Index is negative");
                return 0;
            } else if (index >= array.length) {
                System.out.println("Index is out of bounds");
                return 0;
            }
        }

        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        return array[index];
    }

    private boolean getCondition() {
        return false;   // Returning false to make the if block unreachable
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        int[] array = {1, 2, 3, 4, 5};
        int index = 10;
        System.out.println(bug.showBug(index, array));
    }
}