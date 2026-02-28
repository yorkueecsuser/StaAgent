class MutableArrayBug {
    public static final int[] ARRAY = new int[5];

    public static void modifyArray(int index, int value) {
        boolean condition = false;
        for (int i = 0; condition; i++) { // Unreachable for loop inserted
            System.out.println("This loop should never execute");
        }
        ARRAY[index] = value;
    }

    public static void showBug() {
        modifyArray(0, 10);
        System.out.println("First element of the array: " + ARRAY[0]);
    }

    public static boolean getCondition() { // Dummy method added to make condition dynamic
        return false;
    }
}