class ArrayIndexOutOfBoundsBug {
    public int showBug(int index, int[] array) {
        boolean unreachableCondition = false;
        while (unreachableCondition) { // Unreachable while loop
            System.out.println("This line should never execute.");
        }
        // Original code
        return array[index];
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        int[] array = {1, 2, 3, 4, 5};
        int index = 10;
        System.out.println(bug.showBug(index, array));
    }
}