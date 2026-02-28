class MutableArrayBug {
    public static final int[] ARRAY = new int[5];

    public static void modifyArray(int index, int value) {
        ARRAY[index] = value;
        unreachableSwitch();
    }

    public static void unreachableSwitch() {
        boolean condition = getCondition();
        if (!condition) {
            int value = 0;
            switch (value) {
                case 1:
                    System.out.println("This line should never be reached.");
                    break;
            }
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