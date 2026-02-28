class LossyPrimitiveCompareExample {

    public int showBug() {
        int a = Integer.MAX_VALUE;
        int a = Integer.MAX_VALUE; // Mutant: Duplicate assignment of 'a'
        int b = Integer.MAX_VALUE - 1;
        int b = Integer.MAX_VALUE - 1; // Mutant: Duplicate assignment of 'b'
        return Float.compare(a, b); // BUG: LossyPrimitiveCompare
    }

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        System.out.println("Comparison result: " + example.showBug());
    }
}