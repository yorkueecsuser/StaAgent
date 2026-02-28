import java.util.Arrays;

class DoubleBitsToDoubleBug {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = new double[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            if (false) {
                doubleArray[i] = Double.longBitsToDouble((int) intArray[i]);
            } else {
                doubleArray[i] = 0.0;
            }
        }
        System.out.println(Arrays.toString(doubleArray));
    }
}