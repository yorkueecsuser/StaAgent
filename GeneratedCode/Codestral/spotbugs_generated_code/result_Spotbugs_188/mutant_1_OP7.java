class MutableArrayBug {
    public static final int[] ARRAY = new int[5];

    public static boolean getUnreachableCondition() {
        return false;
    }

    public static void modifyArray(int index, int value) {
        while (getUnreachableCondition()) {
            // This while loop is unreachable, added as per the mutation operator
            // This code will not be executed
            System.out.println("This is unreachable code");
        }
        ARRAY[index] = value;
    }

    public static void showBug() {
        modifyArray(0, 10);
        System.out.println("First element of the array: " + ARRAY[0]);
    }
}