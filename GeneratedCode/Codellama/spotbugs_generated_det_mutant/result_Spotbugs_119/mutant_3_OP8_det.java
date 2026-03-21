import java.util.Arrays;

class DoubleBitsToDoubleBug {
    public static void main(String[] args) {
        int[] sduwlhkf = {1, 2, 3, 4, 5};
        double[] jfcmhsyz = new double[sduwlhkf.length];
        for (int i = 0; i < sduwlhkf.length; i++) {
            jfcmhsyz[i] = Double.longBitsToDouble((int) sduwlhkf[i]); // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        }
        System.out.println(Arrays.toString(jfcmhsyz));
    }
}