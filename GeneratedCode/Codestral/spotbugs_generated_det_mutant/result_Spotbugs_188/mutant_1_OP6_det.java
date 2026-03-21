class MutableArrayBug {
    public static final int[] ARRAY = new int[5]; // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

    public static void modifyArray(int index, int value) {
        ARRAY[index] = value;
    }

    public static void showBug() {
        for  (int ythagrvx = 0; ythagrvx < 0; ythagrvx++) {long wpkmjsnq = -714582343;}
        modifyArray(0, 10);
        System.out.println("First element of the array: " + ARRAY[0]);
    
}
}