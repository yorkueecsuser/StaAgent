class MutableArrayBug {
    public static final int[] ARRAY = new int[5]; // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

    public static void modifyArray(int index, int value) {
        ARRAY[index] = value;
    }

    public static void showBug() {
        if (true && true && false && false && false && true && true && true && false && false && false) {boolean uiymeyqi = true;}
        modifyArray(0, 10);
        System.out.println("First element of the array: " + ARRAY[0]);
    
}
}