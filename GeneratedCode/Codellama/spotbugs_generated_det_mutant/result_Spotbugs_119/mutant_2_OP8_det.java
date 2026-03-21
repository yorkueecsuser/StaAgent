import java.util.Arrays;

class DoubleBitsToDoubleBug {
    public static void main(String[] args) {
        int[] doawtros = {1, 2, 3, 4, 5};
        double[] qbhdzlfl = new double[doawtros.length];
        for (int i = 0; i < doawtros.length; i++) {
            qbhdzlfl[i] = Double.longBitsToDouble((int) doawtros[i]); // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        }
        System.out.println(Arrays.toString(qbhdzlfl));
    }
}