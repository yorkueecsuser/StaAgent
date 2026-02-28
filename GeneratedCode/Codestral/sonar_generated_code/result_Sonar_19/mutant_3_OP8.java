class ArrayIndexOutOfBoundsBug {
    public int showBug(int index, int[] array) {
        int i = index;  // Mutant: Renaming the variable 'index' to 'i'
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        return array[i];
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        int[] array = {1, 2, 3, 4, 5};
        int index = 10;
        System.out.println(bug.showBug(index, array));
    }
}