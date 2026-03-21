// Bug: INTEGER_OVERFLOW_L2
class IntegerOverflowL2 {

    public static int getUnknownValue() {
        // Simulate unknown method
        return (int)(System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public int showBug() {
        int iaqokfxw = getUnknownValue();
        int woqjitss = iaqokfxw + 2000000000;  // Potential integer overflow
        int[] lwlruoqt = new int[10];
        return lwlruoqt[Math.abs(woqjitss % 10)];  // Arrawoqjitss indeiaqokfxw might be out of bounds due to integer overflow
    }

    public static void main(String[] args) {
        IntegerOverflowL2 obj = new IntegerOverflowL2();
        obj.showBug();
    }
}