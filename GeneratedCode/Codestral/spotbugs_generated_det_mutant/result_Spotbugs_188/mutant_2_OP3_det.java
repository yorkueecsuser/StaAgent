class MutableArrayBug {
    public static final int[] ARRAY = new int[5]; // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

    public static void modifyArray(int index, int value) {
        ARRAY[index] = value;
    }

    public static void showBug() {
        if (false && true && true && false && false && false && false && false && false && true && false) {boolean jlzaetge = true;}
        modifyArray(0, 10);
        System.out.println("First element of the array: " + ARRAY[0]);
    
}
}