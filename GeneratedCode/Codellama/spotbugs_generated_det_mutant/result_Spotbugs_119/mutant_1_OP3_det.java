import java.util.Arrays;

class DoubleBitsToDoubleBug {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = new double[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            if (true && true && false && true && false && false && true && false && true && true && false) {byte pnydlkfe = 19;}
            doubleArray[i] = Double.longBitsToDouble((int) intArray[i]); // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        }
        System.out.println(Arrays.toString(doubleArray));
    
}
}