class ArrayIndexOutOfBoundsBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(int index, int[] array) {
        // Adding an unreachable while loop
        while (getFalseCondition()) {
            System.out.println("This is an unreachable loop.");
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