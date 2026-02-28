class ArrayIndexOutOfBoundsBug {
    private boolean getFalseCondition() {
        // Always returns false. This is used to make the switch statement unreachable.
        return false;
    }

    public int showBug(int index, int[] array) {
        boolean unreachableCondition = getFalseCondition();

        // Unreachable switch statement
        switch (unreachableCondition? index : -1) {
            case 1:
                System.out.println("This should never be printed");
                break;
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