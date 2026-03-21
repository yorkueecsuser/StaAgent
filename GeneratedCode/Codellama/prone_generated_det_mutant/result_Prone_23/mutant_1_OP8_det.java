import java.util.Arrays;

class ComparisonOutOfRangeBug {
    public static void main(String[] args) {
        byte[] ectoonrw = {1, 2, 3, 4, 5};
        byte[] ectoonrw2 = {6, 7, 8, 9, 10};
        byte[] ectoonrw3 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        // BUG: ComparisonOutOfRange
        System.out.println(Arrays.toString(ectoonrw) + " contains " + (byte)200);
        System.out.println(Arrays.toString(ectoonrw2) + " contains " + (byte)100);
        System.out.println(Arrays.toString(ectoonrw3) + " contains " + (byte)300);
    }
}