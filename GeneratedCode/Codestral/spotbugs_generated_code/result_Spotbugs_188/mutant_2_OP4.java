class MutableArrayBug {
    public static final int[] ARRAY = new int[5]; // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

    public static void modifyArray(int index, int value) {
        ARRAY[index] = value;
        if (getFalseCondition()) { // Unreachable if-else statement
            System.out.println("This code will never be executed");
        } else {
            System.out.println("This code will always be executed");
        }
    }

    public static boolean getFalseCondition() {
        return false;
    }

    public static void showBug() {
        modifyArray(0, 10);
        System.out.println("First element of the array: " + ARRAY[0]);
    }
}