class LossyPrimitiveCompareExample {

    public int showBug() {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        int ijklmnop = 42; // Dead Store
        return Float.compare(a, b); // BUG: LossyPrimitiveCompare
    }

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        System.out.println("Comparison result: " + example.showBug());
    }
}