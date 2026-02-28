class MutableArrayBug {
    public static final int[] ARRAY = new int[5]; // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

    public static void modifyArray(int index, int value) {
        ARRAY[index] = value;
    }

    public static void showBug() {
        modifyArray(0, 10);
        int a = ARRAY[0]; // Renaming the variable "a" instead of "ARRAY"
        System.out.println("First element of the array: " + a);
    }
}