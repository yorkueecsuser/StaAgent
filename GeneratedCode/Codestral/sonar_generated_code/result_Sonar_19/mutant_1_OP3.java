class ArrayIndexOutOfBoundsBug {
    public int showBug(int index, int[] array) {
        boolean unreachableCondition = isUnreachable();
        if (unreachableCondition) {
            // Unreachable mutant code
            System.out.println("This code should never execute.");
        }
        return array[index];
    }

    private boolean isUnreachable() {
        // This method always returns false to make the if statement unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        int[] array = {1, 2, 3, 4, 5};
        int index = 10;
        System.out.println(bug.showBug(index, array));
    }
}