class MutableArrayBug {
    public static final int[] ARRAY = new int[5]; // Original bug

    public static void modifyArray(int index, int value) {
        ARRAY[index] = value;
        // Mutant code: Duplicating the assignment statement
        ARRAY[index] = value;
    }

    public static void showBug() {
        modifyArray(0, 10);
        System.out.println("First element of the array: " + ARRAY[0]);
    }
}