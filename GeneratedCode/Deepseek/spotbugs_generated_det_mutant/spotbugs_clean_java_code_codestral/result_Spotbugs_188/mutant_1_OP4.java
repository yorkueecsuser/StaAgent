class MutableArrayBug {
    public static final int[] ARRAY = new int[5]; // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

    public static void modifyArray(int index, int value) {
        ARRAY[index] = value;
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This branch is unreachable as shouldRun is always false
            System.out.println("This code should not be executed.");
        } else {
            // This branch is also unreachable
            System.out.println("This code should also not be executed.");
        }
    }

    public static boolean getCondition() {
        // This method always returns false to make the if-else statement unreachable
        return false;
    }

    public static void showBug() {
        modifyArray(0, 10);
        System.out.println("First element of the array: " + ARRAY[0]);
    }
}