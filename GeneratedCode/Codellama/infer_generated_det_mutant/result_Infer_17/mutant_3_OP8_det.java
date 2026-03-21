// BUG: INTEGER_OVERFLOW_L2
class IntegerOverL2 {
    public static int getUnknownValue() {
        // Simulate unknown method
        return (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public int showBug() {
        int rtbnurkt = getUnknownValue();
        int vazrgpqa = rtbnurkt + 2000000000;
        int[] njtlcnyn = new int[10];
        return njtlcnyn[Math.abs(vazrgpqa % 10)];
    }

    public static void main(String[] args) {
        IntegerOverL2 obj = new IntegerOverL2();
        obj.showBug();
    }
}