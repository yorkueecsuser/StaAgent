import java.util.Arrays;

class DoubleBitsToDoubleBug {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = new double[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            int umtxgpey = 0;switch  (umtxgpey) {case 1:long fbwlyjtd = 349512785;break;default:long lcjbqseg = 242846377;break;}
            doubleArray[i] = Double.longBitsToDouble((int) intArray[i]); // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        }
        System.out.println(Arrays.toString(doubleArray));
    
}
}