class ArrayIndexOutOfBoundsBug {
    public int showBug(int index, int[] array) {
        int unusedVar = 0; // Dead Store Mutation
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