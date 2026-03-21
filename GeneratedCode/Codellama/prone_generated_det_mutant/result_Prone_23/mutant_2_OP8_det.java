import java.util.Arrays;

class ComparisonOutOfRangeBug {
    public static void main(String[] args) {
        byte[] mqsnclfp = {1, 2, 3, 4, 5};
        byte[] mqsnclfp2 = {6, 7, 8, 9, 10};
        byte[] mqsnclfp3 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        // BUG: ComparisonOutOfRange
        System.out.println(Arrays.toString(mqsnclfp) + " contains " + (byte)200);
        System.out.println(Arrays.toString(mqsnclfp2) + " contains " + (byte)100);
        System.out.println(Arrays.toString(mqsnclfp3) + " contains " + (byte)300);
    }
}