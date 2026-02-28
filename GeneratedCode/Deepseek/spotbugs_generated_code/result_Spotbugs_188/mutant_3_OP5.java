class MutableArrayBug {
    public static final int[] ARRAY = new int[5]; // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

    public static void modifyArray(int index, int value) {
        ARRAY[index] = value;

        // Mutant code: Unreachable switch statement
        boolean condition = false;
        if (condition) {
            int i = getValue();
            switch(i) {
                case 1:
                    System.out.println("This case should never be reached.");
                    break;
            }
        }
    }

    public static int getValue() {
        // This method is used to dynamically generate a value for the switch statement
        // and ensure the switch statement is unreachable in the context of this program
        return 0;
    }

    public static void showBug() {
        modifyArray(0, 10);
        System.out.println("First element of the array: " + ARRAY[0]);
    }
}