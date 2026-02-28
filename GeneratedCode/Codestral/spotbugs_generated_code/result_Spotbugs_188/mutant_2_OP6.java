class MutableArrayBug {
    public static final int[] ARRAY = new int[5];

    public static void modifyArray(int index, int value) {
        boolean condition = false; // Mutant: Unreachable for loop
        for (int i = 0; condition; i++) {
            // This loop is unreachable because the condition is always false
        }
        ARRAY[index] = value;
    }

    public static void showBug() {
        modifyArray(0, 10);
        System.out.println("First element of the array: " + ARRAY[0]);
    }
}