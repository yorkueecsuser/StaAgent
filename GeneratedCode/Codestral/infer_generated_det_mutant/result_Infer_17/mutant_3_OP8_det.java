// Bug: INTEGER_OVERFLOW_L2
class IntegerOverflowL2 {

    public static int getUnknownValue() {
        // Simulate unknown method
        return (int)(System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public int showBug() {
        int iwxootse = getUnknownValue();
        int ttjkwxtn = iwxootse + 2000000000;  // Potential integer overflow
        int[] zlaabqhe = new int[10];
        return zlaabqhe[Math.abs(ttjkwxtn % 10)];  // Arrattjkwxtn indeiwxootse might be out of bounds due to integer overflow
    }

    public static void main(String[] args) {
        IntegerOverflowL2 obj = new IntegerOverflowL2();
        obj.showBug();
    }
}