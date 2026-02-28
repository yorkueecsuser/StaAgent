class ArrayIndexOutOfBoundsBug {
    public int showBug(int index, int[] array) {
        // Added mutant: dead store
        int deadStore = 0;

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