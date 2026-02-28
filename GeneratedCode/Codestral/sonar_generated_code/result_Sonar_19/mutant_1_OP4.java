class ArrayIndexOutOfBoundsBug {
    public int showBug(int index, int[] array) {
        boolean unreachableCondition = falseMethod();
        if (unreachableCondition) {
            // This branch is unreachable, as the condition is always false
            throw new RuntimeException("Unreachable branch");
        }
        // Original code
        return array[index];
    }

    public boolean falseMethod() {
        return false;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        int[] array = {1, 2, 3, 4, 5};
        int index = 10;
        System.out.println(bug.showBug(index, array));
    }
}