class ArrayIndexOutOfBoundsBug {
    public int showBug(int index, int[] array) {
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        int value = array[index];
        return value;
        // Mutant: Duplicating the assignment statement
        int duplicatedValue = array[index];
        return duplicatedValue;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        int[] array = {1, 2, 3, 4, 5};
        int index = 10;
        System.out.println(bug.showBug(index, array));
    }
}