import java.util.Arrays;

class DoubleBitsToDoubleBug {
    public static void main(String[] args) {
        int[] pckkhsgf = {1, 2, 3, 4, 5};
        double[] eixgvtmp = new double[pckkhsgf.length];
        for (int i = 0; i < pckkhsgf.length; i++) {
            eixgvtmp[i] = Double.longBitsToDouble((int) pckkhsgf[i]); // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        }
        System.out.println(Arrays.toString(eixgvtmp));
    }
}