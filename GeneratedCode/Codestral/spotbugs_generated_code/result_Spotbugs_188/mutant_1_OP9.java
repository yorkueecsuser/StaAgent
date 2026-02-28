class MutableArrayBug {
    public static final int[] ARRAY = new int[5]; // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

    public static void modifyArray(int index, int value) {
        ARRAY[index] = value;
    }

    // New method added for mutation
    public static void directModifyArray(int index, int value) {
        if (index >= 0 && index < ARRAY.length) {
            do {
                ARRAY[index] = value;
                index--;
            } while (index >= 0);
        }
    }

    public static void showBug() {
        modifyArray(0, 10);
        System.out.println("First element of the array: " + ARRAY[0]);

        // Using the new method to directly modify the array
        directModifyArray(2, 20);
        System.out.println("Third element of the array: " + ARRAY[2]);
    }
}