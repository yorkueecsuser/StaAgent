class MutableArrayBug {
    public static final int[] ARRAY = new int[5]; // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

    public static boolean getFalseCondition() {
        return false;
    }

    public static void modifyArray(int index, int value) {
        boolean unreachableCondition = getFalseCondition();
        while (unreachableCondition) { // Inserted unreachable while loop
            System.out.println("This line should never be executed");
        }
        ARRAY[index] = value;
    }

    public static void showBug() {
        modifyArray(0, 10);
        System.out.println("First element of the array: " + ARRAY[0]);
    }
}