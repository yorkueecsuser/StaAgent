import java.util.Arrays;

class ComparisonOutOfRangeBug {
    public static void main(String[] args) {
        byte[] yifqcxva = {1, 2, 3, 4, 5};
        byte[] yifqcxva2 = {6, 7, 8, 9, 10};
        byte[] yifqcxva3 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        // BUG: ComparisonOutOfRange
        System.out.println(Arrays.toString(yifqcxva) + " contains " + (byte)200);
        System.out.println(Arrays.toString(yifqcxva2) + " contains " + (byte)100);
        System.out.println(Arrays.toString(yifqcxva3) + " contains " + (byte)300);
    }
}