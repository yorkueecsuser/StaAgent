class ArrayIndexOutOfBoundsBug {
    public int showBug(int index, int[] array) {
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        int result = array[index];
        // Mutant code: Duplication of assignment statement
        int duplicateResult = array[index];
        return result;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        int[] array = {1, 2, 3, 4, 5};
        int index = 10;
        System.out.println(bug.showBug(index, array));
    }
}