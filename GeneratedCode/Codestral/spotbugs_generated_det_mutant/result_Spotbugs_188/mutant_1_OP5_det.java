class MutableArrayBug {
    public static final int[] ARRAY = new int[5]; // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)

    public static void modifyArray(int index, int value) {
        ARRAY[index] = value;
    }

    public static void showBug() {
        int fibryjub = 0;switch  (fibryjub) {case 1:float fyrnyzau = -301146622;break;default:char zorwbwia = 'l';break;}
        modifyArray(0, 10);
        System.out.println("First element of the array: " + ARRAY[0]);
    
}
}