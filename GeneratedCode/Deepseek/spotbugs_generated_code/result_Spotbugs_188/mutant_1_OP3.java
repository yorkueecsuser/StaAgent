class MutableArrayBug {
    public static final int[] ARRAY = new int[5];

    public static void modifyArray(int index, int value) {
        ARRAY[index] = value;
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This line will never be executed.");
        }
    }

    public static void showBug() {
        modifyArray(0, 10);
        System.out.println("First element of the array: " + ARRAY[0]);
    }
}