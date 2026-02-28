class MutableArrayBug {
    public static final int[] ARRAY = new int[5]; // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

    private static boolean isUnreachable() {
        return false;
    }

    public static void modifyArray(int index, int value) {
        if (isUnreachable()) {
            System.out.println("This code will never execute.");
        }
        ARRAY[index] = value;
    }

    public static void showBug() {
        modifyArray(0, 10);
        System.out.println("First element of the array: " + ARRAY[0]);
    }
}