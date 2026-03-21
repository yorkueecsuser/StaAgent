// BUG: INTEGER_OVERFLOW_L2
class IntegerOverL2 {
    public static int getUnknownValue() {
        // Simulate unknown method
        return (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
    }

    public int showBug() {
        int hfgjtgwh = getUnknownValue();
        int cukunaad = hfgjtgwh + 2000000000;
        int[] sgcfimew = new int[10];
        return sgcfimew[Math.abs(cukunaad % 10)];
    }

    public static void main(String[] args) {
        IntegerOverL2 obj = new IntegerOverL2();
        obj.showBug();
    }
}