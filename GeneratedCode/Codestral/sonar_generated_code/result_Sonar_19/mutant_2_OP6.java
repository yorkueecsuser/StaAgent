class ArrayIndexOutOfBoundsBug {
    private boolean getCondition() {
        return false;
    }

    public int showBug(int index, int[] array) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            System.out.println("Unreachable loop");
        }
        return array[index];
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        int[] array = {1, 2, 3, 4, 5};
        int index = 10;
        System.out.println(bug.showBug(index, array));
    }
}