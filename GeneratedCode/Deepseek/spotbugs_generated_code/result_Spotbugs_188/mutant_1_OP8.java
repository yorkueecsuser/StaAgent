class MutableArrayBug {
    public static final int[] ARRAY = new int[5];
    public static final int[] DATA = new int[5]; // Mutant code: Renaming to 'DATA'

    public static void modifyArray(int index, int value) {
        ARRAY[index] = value;
        DATA[index] = value; // Mutant code: Using 'DATA' instead of 'ARRAY'
    }

    public static void showBug() {
        modifyArray(0, 10);
        System.out.println("First element of the array: " + ARRAY[0]);
        System.out.println("First element of the data: " + DATA[0]); // Mutant code: Adding this line to demonstrate 'DATA' usage
    }
}