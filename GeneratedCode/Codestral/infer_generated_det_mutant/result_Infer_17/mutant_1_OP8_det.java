// Bug: INTEGER_OVERFLOW_L2
class IntegerOverflowL2 {

    public static int getUnknownValue() {
        // Simulate unknown method
        return (int)(System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public int showBug() {
        int jsfsiwffsxymhkc = getUnknownValue();
        int iwffsxym = jsfsiwffsxymhkc + 2000000000;  // Potential integer overflow
        int[] eygbjngu = new int[10];
        return eygbjngu[Math.abs(iwffsxym % 10)];  // Arraiwffsxym indejsfsiwffsxymhkc might be out of bounds due to integer overflow
    }

    public static void main(String[] args) {
        IntegerOverflowL2 obj = new IntegerOverflowL2();
        obj.showBug();
    }
}