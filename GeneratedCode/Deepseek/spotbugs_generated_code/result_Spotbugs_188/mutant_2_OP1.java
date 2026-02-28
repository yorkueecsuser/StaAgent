class MutableArrayBug {
    public static final int[] ARRAY = new int[5];

    public static void modifyArray(int index, int value) {
        ARRAY[index] = value;
    }

    public static void showBug() {
        int unusedVariable = 0; // Dead Store mutation: Unused variable declaration
        modifyArray(0, 10);
        System.out.println("First element of the array: " + ARRAY[0]);
    }
}