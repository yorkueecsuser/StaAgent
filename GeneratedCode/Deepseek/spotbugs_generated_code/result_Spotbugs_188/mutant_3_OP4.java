class MutableArrayBug {
    public static final int[] ARRAY = new int[5]; // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

    public static void modifyArray(int index, int value) {
        if (getCondition()) { // This condition is always false and makes the entire block unreachable
            ARRAY[index] = value;
        } else {
            // Unreachable block
            int temp = ARRAY[index];
            ARRAY[index] = temp + 1; // This line will never be executed
        }
    }

    private static boolean getCondition() {
        return false;
    }

    public static void showBug() {
        modifyArray(0, 10);
        System.out.println("First element of the array: " + ARRAY[0]);
    }
}