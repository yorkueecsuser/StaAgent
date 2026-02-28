import java.util.Arrays;

class DoubleBitsToDoubleBug {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = new double[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            doubleArray[i] = Double.longBitsToDouble((int) intArray[i]); // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        }
        System.out.println(Arrays.toString(doubleArray));
    }
}

// Mutant 1: Duplicate the assignment statement and insert it after the current location
// (i.e., doubleArray[i] = Double.longBitsToDouble((int) intArray[i]);)
doubleArray[i] = Double.longBitsToDouble((int) intArray[i]);

// Mutant 2: Duplicate the assignment statement and insert it after the current location
// (i.e., doubleArray[i] = Double.longBitsToDouble((int) intArray[i]);)
doubleArray[i] = Double.longBitsToDouble((int) intArray[i]);