class ArrayIndexOutOfBoundsBug {
    private boolean getCondition() {
        return false;
    }

    public int showBug(int index, int[] array) {
        // Adding an unreachable while loop
        while (getCondition()) {
            // This code block is unreachable
            System.out.println("Unreachable Code Block");
        }

        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        return array[index];
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        int[] array = {1, 2, 3, 4, 5};
        int index = 10;
        System.out.println(bug.showBug(index, array));
    }
}