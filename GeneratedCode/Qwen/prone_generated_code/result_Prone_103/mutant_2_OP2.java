class LossyPrimitiveCompareExample {

    public int showBug() {
        int a = Integer.MAX_VALUE;
        int aCopy = Integer.MAX_VALUE; // Duplicate assignment of 'a'
        int b = Integer.MAX_VALUE - 1;
        int bCopy = Integer.MAX_VALUE - 1; // Duplicate assignment of 'b'
        return Float.compare(a, b); // BUG: LossyPrimitiveCompare
    }

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        System.out.println("Comparison result: " + example.showBug());
    }
}