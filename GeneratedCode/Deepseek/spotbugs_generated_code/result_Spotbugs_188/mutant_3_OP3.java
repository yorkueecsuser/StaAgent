class MutableArrayBug {
    public static final int[] ARRAY = new int[5]; // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

    public static boolean getUnreachableCondition() {
        return false; // This function is always returning false
    }

    public static void modifyArray(int index, int value) {
        if (getUnreachableCondition()) {
            // This branch will never be executed
            int temp = ARRAY[index];
            ARRAY[index] = value;
            value = temp;
        } else {
            ARRAY[index] = value;
        }
    }

    public static void showBug() {
        modifyArray(0, 10);
        System.out.println("First element of the array: " + ARRAY[0]);
    }
}