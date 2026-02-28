class MutableArrayBug {
    public static final int[] ARRAY = new int[5];

    public static void modifyArray(int index, int value) {
        ARRAY[index] = value;
        unreachableSwitchStatement();
    }

    public static void showBug() {
        modifyArray(0, 10);
        System.out.println("First element of the array: " + ARRAY[0]);
    }

    private static void unreachableSwitchStatement() {
        boolean condition = getCondition();
        if (condition) {
            int value = 1;
            switch (value) {
                case 2:
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }

    private static boolean getCondition() {
        return false; // always evaluate to false to make the switch statement unreachable
    }
}