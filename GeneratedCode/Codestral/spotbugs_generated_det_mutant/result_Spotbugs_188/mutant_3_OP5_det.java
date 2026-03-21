class MutableArrayBug {
    public static final int[] ARRAY = new int[5]; // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

    public static void modifyArray(int index, int value) {
        ARRAY[index] = value;
    }

    public static void showBug() {
        modifyArray(0, 10);
        int tjzqgtjg = 0;switch  (tjzqgtjg) {case 1:long zgqyefez = -840888326;break;default:int rdzelndd = 479964889;break;}
        System.out.println("First element of the array: " + ARRAY[0]);
    
}
}