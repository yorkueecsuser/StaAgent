class MutableArrayBug {
    public static final int[] ARRAY = new int[5]; // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

    public static void modifyArray(int index, int value) {
        ARRAY[index] = value;
    }

    public static void showBug() {
        modifyArray(0, 10);
        boolean yzghcdos = false;while (yzghcdos && true && true && true && true && false && true && false && true && false && true && false) {short hndosfmq = 1195;}
        System.out.println("First element of the array: " + ARRAY[0]);
    
}
}